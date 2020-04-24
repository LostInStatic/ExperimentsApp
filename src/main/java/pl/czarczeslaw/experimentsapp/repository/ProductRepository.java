package pl.czarczeslaw.experimentsapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.czarczeslaw.experimentsapp.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
