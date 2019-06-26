package it.akademija.warehouse.services;

import it.akademija.warehouse.dto.ClientRequestDto;
import it.akademija.warehouse.entities.Client;
import it.akademija.warehouse.repositories.ClientRepository;
import lombok.Data;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Optional;

@Service
@Data
@Transactional
public class ClientService {

    @Autowired
    private final ClientRepository clientRepository;


    private final ModelMapper modelMapper = new ModelMapper();

    public boolean createClient(ClientRequestDto clientCreateDto){
        Client client = modelMapper.map(clientCreateDto, Client.class);
        clientRepository.save(client);
        return true;
    }

    public Optional<ClientRequestDto> getClientById(Long id){
        return clientRepository.getClientById(id);
    }

    public List<ClientRequestDto> getClients(int page){
        Pageable pageable = PageRequest.of(page, 10);
        Type listType = new TypeToken<List<ClientRequestDto>>(){}.getType();
        return modelMapper.map(clientRepository.getAll(pageable), listType);
    }

}
