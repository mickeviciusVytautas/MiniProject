package it.akademija.share.services;

import it.akademija.share.dto.ShareRequestDto;
import it.akademija.share.entities.Share;
import it.akademija.share.repositories.ShareRepository;
import lombok.Data;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import javax.transaction.Transactional;

@Service
@Data
public class ShareService {

    @Autowired
    private final ShareRepository shareRepository;


    private final ModelMapper modelMapper = new ModelMapper();

    @Transactional
    public boolean postShare(@RequestBody ShareRequestDto shareRequestDto){
        Share share = modelMapper.map(shareRequestDto, Share.class);
        shareRepository.save(share);
        return true;
    }

}
