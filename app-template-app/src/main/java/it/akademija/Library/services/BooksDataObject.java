package it.akademija.Library.services;


import it.akademija.Library.services.BookObject;



public class BooksDataObject {

    private int quantity;

    private String quality;

    private double price;

    private BookObject bookObject;

    public BooksDataObject(int quantity, String quality, double price) {
        this.quantity = quantity;
        this.quality = quality;
        this.price = price;

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

    public BookObject getBook() {
        return bookObject;
    }

    public void setBook(BookObject bookObject) {
        this.bookObject = bookObject;
    }
}
