package it.akademija.warehouse.dto;

import it.akademija.warehouse.entities.Client;
import lombok.Data;

import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
public class InventoryRequestDto {

    private Long id;
    private String name;
    private Double weight;
    private int sector;
    private Date creationDate;
    private Long clientId;
}
