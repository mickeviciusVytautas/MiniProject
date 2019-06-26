package it.akademija.warehouse.entities;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@Entity
public class Inventory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String name;

    @NotNull
    private Double weight;

    @NotNull
    private int sector;

    @NotNull
    private Date creationDate;

    @ManyToOne
    private Client client;
}
