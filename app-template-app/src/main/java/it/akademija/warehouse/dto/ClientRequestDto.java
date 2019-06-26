package it.akademija.warehouse.dto;

import it.akademija.warehouse.auxilary.ClientType;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class ClientRequestDto {
    private Long id;
    private String name;
    private String surname;
    private Date birthDate;
    private String number;
    private String type;

    public ClientRequestDto(String name, String surname, Date birthDate, String number, ClientType type) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.number = number;
        this.type = type.toValue();
    }
}
