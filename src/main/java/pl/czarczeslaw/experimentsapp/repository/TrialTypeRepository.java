package pl.czarczeslaw.experimentsapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.czarczeslaw.experimentsapp.model.TrialType;

@Repository
public interface TrialTypeRepository extends JpaRepository<TrialType, Long> {
}
