package it.akademija.Library.services;

public class BookObject {
    public BookObject(){};
    public BookObject(String title, String author, String image, int pages) {
        this.title = title;
        this.image = image;
        this.author = author;
        this.pages = pages;
    }


    private String title;

    private String image;

    private String author;

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
}
