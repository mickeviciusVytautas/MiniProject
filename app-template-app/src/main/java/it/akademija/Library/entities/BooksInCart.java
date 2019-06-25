package it.akademija.Library.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class BooksInCart {

    @Id
    private long id;

    @ManyToOne(cascade = CascadeType.ALL)
    private Cart cart;

    private int quantity;

    @ManyToOne
    private BooksData booksData;


    public BooksInCart() {};

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public BooksData getBooksData() {
        return booksData;
    }

    public void setProduct(BooksData booksData) {
        this.booksData = booksData;
    }

    public BooksInCart(long id, Cart cart, int quantity, BooksData booksData) {
        this.id = id;
        this.cart = cart;
        this.quantity = quantity;
        this.booksData = booksData;
    }



}
