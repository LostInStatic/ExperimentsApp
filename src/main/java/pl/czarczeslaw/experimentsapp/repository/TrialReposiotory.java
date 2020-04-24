package pl.czarczeslaw.experimentsapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.czarczeslaw.experimentsapp.model.Trial;

@Repository
public interface TrialReposiotory extends JpaRepository<Trial, Long> {
}
