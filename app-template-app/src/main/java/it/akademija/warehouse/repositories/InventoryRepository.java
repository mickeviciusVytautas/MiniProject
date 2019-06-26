package it.akademija.warehouse.repositories;

import it.akademija.warehouse.entities.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<Inventory, Long>{

}
