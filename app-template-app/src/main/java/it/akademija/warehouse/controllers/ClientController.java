package it.akademija.warehouse.controllers;

import it.akademija.warehouse.dto.ClientRequestDto;
import it.akademija.warehouse.entities.Client;
import it.akademija.warehouse.services.ClientService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.ResponseCache;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api/client")
@Data
public class ClientController {

    @Autowired
    private final ClientService clientService;

    @PostMapping
    public ResponseEntity<String> createClient(@RequestBody ClientRequestDto clientCreateDto){
        if(clientService.createClient(clientCreateDto)){
            return new ResponseEntity<String>(HttpStatus.CREATED);
        }
        return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
    }

    @GetMapping(value = "/one/{id}")
    public ResponseEntity<ClientRequestDto>getClientById(@PathVariable Long id){
        Optional<ClientRequestDto> clientRequest = clientService.getClientById(id);
        return clientRequest.map(clientRequestDto ->
                new ResponseEntity<>(clientRequestDto, HttpStatus.FOUND)).orElseGet(() ->
                new ResponseEntity<>(HttpStatus.NOT_FOUND));

    }

    @GetMapping(value = "/{page}")
    public List<ClientRequestDto> getClients(@PathVariable int page){
        return clientService.getClients(page);
    }
}
