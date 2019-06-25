package it.akademija.share.controllers;

import it.akademija.share.dto.ShareRequestDto;
import it.akademija.share.services.ShareService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/share")
@Data
public class ShareController {

    @Autowired
    private final ShareService shareService;

    @PostMapping
    public ResponseEntity<String> postShare(@RequestBody ShareRequestDto shareRequestDto){
        if(!shareRequestDto.getTitle().isEmpty()){
            if(shareService.postShare(shareRequestDto)){
                return new ResponseEntity<String>(HttpStatus.CREATED);
            }
        }
        return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
    }
}
