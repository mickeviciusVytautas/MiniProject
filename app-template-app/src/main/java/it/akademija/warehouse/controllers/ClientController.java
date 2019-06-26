package it.akademija.warehouse.controllers;

import it.akademija.warehouse.dto.ClientCreateDto;
import it.akademija.warehouse.services.ClientService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/client")
@Data
public class ClientController {

    @Autowired
    private final ClientService clientService;

    @PostMapping
    public ResponseEntity<String> createClient(@RequestBody ClientCreateDto clientCreateDto){
        if(clientService.createClient(clientCreateDto)){
            return new ResponseEntity<String>(HttpStatus.CREATED);
        }
        return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
    }
}
