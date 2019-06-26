package it.akademija.warehouse.services;

import it.akademija.warehouse.dto.ClientCreateDto;
import it.akademija.warehouse.entities.Client;
import it.akademija.warehouse.repositories.ClientRepository;
import lombok.Data;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import javax.transaction.Transactional;

@Service
@Data
public class ClientService {

    @Autowired
    private final ClientRepository clientRepository;


    private final ModelMapper modelMapper = new ModelMapper();

    @Transactional
    public boolean createClient(@RequestBody ClientCreateDto clientCreateDto){
        Client client = modelMapper.map(clientCreateDto, Client.class);
        clientRepository.save(client);
        return true;
    }

}
