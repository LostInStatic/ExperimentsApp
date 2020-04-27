package pl.czarczeslaw.experimentsapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import pl.czarczeslaw.experimentsapp.model.UserRoles;
import pl.czarczeslaw.experimentsapp.repository.UserRoleRepository;

import java.util.*;

@Service
public class UserRoleService {
    @Value("${account.default.roles:USER}")
    private String[] defaultRoles;

    private final UserRoleRepository userRoleRepository;

    @Autowired
    public UserRoleService(UserRoleRepository userRoleRepository) {
        this.userRoleRepository = userRoleRepository;
    }

    public List<UserRoles> getDefaultRoles() {
        List<UserRoles> userRoles = new ArrayList<>();

        for (String role : defaultRoles) {
            Optional<UserRoles> optional = userRoleRepository.findByName(role);
            optional.ifPresent(userRoles::add);
        }

        return userRoles;
    }

    public List<UserRoles> getAll() {
        return userRoleRepository.findAll();
    }
}
