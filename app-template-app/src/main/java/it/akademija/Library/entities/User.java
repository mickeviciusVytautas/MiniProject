package it.akademija.Library.entities;


import javax.persistence.*;

@Entity
@Table(name="users")
public class User {


    @Id
    private String username;

    @OneToOne(cascade = CascadeType.ALL)
    private Cart cart;

    public User(){};

    public User(String username, Cart cart) {
        this.username = username;
        this.cart = cart;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }
}
