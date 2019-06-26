package it.akademija.warehouse.entities;

import it.akademija.Library.entities.User;
import it.akademija.warehouse.auxilary.ClientType;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Data
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
    private Date birthDate;

    @Size(max = 10, min = 10)
    private String number;

    private ClientType type;

    @ManyToOne
    private User user;
}
