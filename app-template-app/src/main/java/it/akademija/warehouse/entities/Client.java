package it.akademija.warehouse.entities;

import it.akademija.warehouse.auxilary.ClientType;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;

@Entity
@Data
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String name;
    @NotNull
    private String surname;
    @NotNull
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy/MM/dd")
    private Date birthDate;

    @Size(max = 10, min = 10)
    @NotNull
    private String number;

    @NotNull
    private ClientType type;

    @OneToMany
    private List<Inventory> inventoryList;
}
