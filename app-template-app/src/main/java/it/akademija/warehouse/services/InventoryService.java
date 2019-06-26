package it.akademija.warehouse.services;

import it.akademija.warehouse.dto.InventoryRequestDto;
import it.akademija.warehouse.entities.Client;
import it.akademija.warehouse.entities.Inventory;
import it.akademija.warehouse.repositories.ClientRepository;
import it.akademija.warehouse.repositories.InventoryRepository;
import lombok.Data;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;

import javax.xml.ws.Response;
import java.util.Optional;

@Data
@Service
@Transactional
public class InventoryService {

    @Autowired
    private final InventoryRepository inventoryRepository;

    @Autowired
    private final ClientRepository clientRepository;

    @PostMapping
    public ResponseEntity<String> createInventory(InventoryRequestDto inventoryRequestDto, Long clientId){
        Optional<Client> client = clientRepository.getClientById(clientId);
        if(!client.isPresent()){
            return new ResponseEntity<String> ("Client not found",HttpStatus.NOT_FOUND);
        }
        Inventory inventory = new Inventory();
        BeanUtils.copyProperties(inventoryRequestDto, inventory);
        inventory.setClient(client.get());
        inventoryRepository.save(inventory);
        return new ResponseEntity<String> ("Succesfully created inventory", HttpStatus.ACCEPTED);
    }
}
