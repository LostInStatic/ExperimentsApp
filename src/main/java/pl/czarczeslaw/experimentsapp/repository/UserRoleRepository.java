package pl.czarczeslaw.experimentsapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.czarczeslaw.experimentsapp.model.UserRoles;

import java.util.Optional;

@Repository
public interface UserRoleRepository extends JpaRepository<UserRoles, Long> {

    Optional<UserRoles> findByName(String name);
    boolean existsByName(String name);
}
