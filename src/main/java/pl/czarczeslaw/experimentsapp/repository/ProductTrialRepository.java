package pl.czarczeslaw.experimentsapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.czarczeslaw.experimentsapp.model.ProductTrial;

@Repository
public interface ProductTrialRepository extends JpaRepository<ProductTrial, Long> {
}
