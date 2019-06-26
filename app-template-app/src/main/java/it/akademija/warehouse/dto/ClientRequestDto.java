package it.akademija.warehouse.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import it.akademija.warehouse.auxilary.ClientType;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class ClientRequestDto {
    private Long id;
    private String name;
    private String surname;
    private Date birthDate;
    private String number;
    private String type;
    private int inventoryNumber;
    public ClientRequestDto(String name, String surname, Date birthDate, String number, ClientType type) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.number = number;
        this.type = type.toValue();
    }

    public ClientRequestDto(Long id, String name, String surname, Date birthDate, String number, ClientType type) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.number = number;
        this.type = type.toValue();
    }

    public ClientRequestDto(Long id, String name, String surname, Date birthDate, String number, ClientType type,
            int inventoryNumber) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.number = number;
        this.type = type.toValue();
        this.inventoryNumber = inventoryNumber;
    }
}
