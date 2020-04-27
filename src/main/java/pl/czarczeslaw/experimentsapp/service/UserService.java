package pl.czarczeslaw.experimentsapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import pl.czarczeslaw.experimentsapp.model.User;
import pl.czarczeslaw.experimentsapp.repository.UserRepository;
import pl.czarczeslaw.experimentsapp.repository.UserRoleRepository;

import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final UserRoleService userRoleService;
    private final UserRoleRepository userRoleRepository;

    @Autowired
    public UserService(UserRepository accountRepository, PasswordEncoder passwordEncoder, UserRoleService userRoleService, UserRoleRepository accountRoleRepository) {
        this.userRepository = accountRepository;
        this.passwordEncoder = passwordEncoder;
        this.userRoleService = userRoleService;
        this.userRoleRepository = accountRoleRepository;
    }

    public boolean register(User account) {
        if (userRepository.existsByUsername(account.getUsername())) {
            return false;
        }

        // szyfrowanie hasła
        account.setPassword(passwordEncoder.encode(account.getPassword()));
        account.setAccountRoles(userRoleService.getDefaultRoles());

        // zapis do bazy
        userRepository.save(account);

        return true;
    }

    public Optional<User> findById(Long accountId) {
        return userRepository.findById(accountId);
    }

}
