package pl.czarczeslaw.experimentsapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.czarczeslaw.experimentsapp.model.TrialPhoto;

public interface TrialPhotoRepository extends JpaRepository<TrialPhoto, Long> {
}
