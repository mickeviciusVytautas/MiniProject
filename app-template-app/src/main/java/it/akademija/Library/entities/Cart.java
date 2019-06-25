package it.akademija.Library.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToMany(cascade = CascadeType.ALL)
    private List<BooksData> booksData;

    private double totalPrice;

    public Cart() {};

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<BooksData> getBooksData() {
        return booksData;
    }

    public void setBooksData(List<BooksData> booksData) {
        this.booksData = booksData;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Cart(long id, List<BooksData> booksData, double totalPrice) {
        this.id = id;
        this.booksData = booksData;
        this.totalPrice = totalPrice;
    }
}
