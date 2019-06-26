package it.akademija.warehouse.dto;

import it.akademija.warehouse.auxilary.ClientType;
import lombok.Data;

import java.util.Date;

@Data
public class ClientCreateDto {
    private Long id;
    private String name;
    private String surname;
    private Date birthDate;
    private String number;
    private String type;
}
