package pl.czarczeslaw.experimentsapp.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import pl.czarczeslaw.experimentsapp.mapper.ProductMapper;
import pl.czarczeslaw.experimentsapp.mapper.TrialMapper;
import pl.czarczeslaw.experimentsapp.model.*;
import pl.czarczeslaw.experimentsapp.model.dto.CreateProductDto;
import pl.czarczeslaw.experimentsapp.model.dto.CreateTrialDto;
import pl.czarczeslaw.experimentsapp.repository.ProductRepository;
import pl.czarczeslaw.experimentsapp.repository.TrialReposiotory;
import pl.czarczeslaw.experimentsapp.repository.UserRepository;
import pl.czarczeslaw.experimentsapp.repository.UserRoleRepository;

import java.util.*;

@Component
public class DataInit {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final UserRoleRepository userRoleRepository;

    @Autowired
    public DataInit(UserRepository userRepository, PasswordEncoder passwordEncoder, UserRoleRepository userRoleRepository) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
        this.userRoleRepository = userRoleRepository;
    }

//    @Bean
//    public CommandLineRunner onApplicationEvent(ProductRepository productRepository, TrialReposiotory trialReposiotory, ProductMapper productMapper, TrialMapper trialMapper) {
//        return args -> {
//            addDefaultRole("USER");
//            addDefaultRole("ADMIN");
//
//            addDefaultUser("admin", "admin", "ADMIN", "USER");
//            addDefaultUser("user", "user", "USER");
//        };
//    }

    private void addDefaultUser(String username, String password, String... roles) {
        if (!userRepository.existsByUsername(username)) {
            User user = new User();
            user.setUsername(username);
            user.setPassword(passwordEncoder.encode(password));

            List<UserRoles> userRoles = findRoles(roles);
            user.setAccountRoles(userRoles);

            userRepository.save(user);
        }

    }

    private List<UserRoles> findRoles(String[] roles) {
        List<UserRoles> userRoles = new ArrayList<>();
        for (String role : roles) {
            userRoleRepository.findByName(role).ifPresent(userRoles::add);
        }
        return userRoles;
    }

    private void addDefaultRole(String role) {
        if (!userRoleRepository.existsByName(role)) {
            UserRoles newRole = new UserRoles();
            newRole.setName(role);

            userRoleRepository.save(newRole);
        }
    }
}
