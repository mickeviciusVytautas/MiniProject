package it.akademija.share.entities;

import it.akademija.Library.entities.User;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Share {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private String comment;

    @ManyToOne
    private User user;
}
