package it.akademija.Library.repositories;

import it.akademija.Library.entities.Institution;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstitutionRepository extends JpaRepository <Institution, String> {
    Institution findByTitle(String institutionTitle);


}
