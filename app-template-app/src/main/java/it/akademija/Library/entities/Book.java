package it.akademija.Library.entities;

import javax.persistence.*;
import java.util.List;


@Entity

public class Book {

    @Id
    private String title;

    public Book(){};
    public Book(String title, String author, String image,  int pages) {
        this.title = title;
        this.image = image;
        this.author = author;
        this.pages = pages;
    }


    //    @JoinColumn(name = "book_Id")
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "book")
    private List<BooksData> booksData;

    @Column
    private String image;

    @Column
    private String author;

    @Column
    private int pages;
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public List<BooksData> getBooksData() {
        return booksData;
    }

    public void setBooksData(List<BooksData> booksData) {
        this.booksData = booksData;
    }

    public void addBooksData(BooksData booksData){
        this.booksData.add(booksData);
    }
}
