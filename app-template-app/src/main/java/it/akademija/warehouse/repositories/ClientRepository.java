package it.akademija.warehouse.repositories;

import it.akademija.warehouse.dto.ClientRequestDto;
import it.akademija.warehouse.entities.Client;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

    @Query("SELECT new it.akademija.warehouse.dto.ClientRequestDto " +
            "(c.name, c.surname, c.birthDate, c.number, c.type) "+
            "FROM Client c WHERE c.id = :id")
    Optional<ClientRequestDto> getClientById(@Param("id") Long id);

    @Query("SELECT c FROM Client c")
    List<Client> getAll(Pageable pageable);
}
