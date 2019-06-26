package it.akademija.warehouse.controllers;

import it.akademija.warehouse.dto.InventoryRequestDto;
import it.akademija.warehouse.services.InventoryService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Data
@RestController
@RequestMapping(value = "/api/inventory")
public class InventoryController {

    @Autowired
    private InventoryService inventoryService;

    @PostMapping
    public ResponseEntity<String> createInventory(@RequestBody InventoryRequestDto inventoryRequestDto, @PathVariable Long clientId){
        return inventoryService.createInventory(inventoryRequestDto, clientId);
    }
}
