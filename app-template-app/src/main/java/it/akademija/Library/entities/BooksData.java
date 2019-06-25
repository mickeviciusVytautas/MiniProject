package it.akademija.Library.entities;

import javax.persistence.*;

@Entity
public class BooksData {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(nullable = false)
    private int quantity;
    @Column(nullable = false)
    private String quality;
    @Column(nullable = false)
    private double price;


    //    @JoinColumn(name = "bookId", nullable = false)

    @ManyToOne
    private Book book;

    @ManyToOne
    private Institution institution;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
//    @JoinColumn(name = "institutionId")
//    @OneToOne(mappedBy = "booksInInstitution")
//    private Enums institution;


    public Institution getInstitution() {
        return institution;
    }

    public void setInstitution(Institution institution) {
        this.institution = institution;
    }
}
