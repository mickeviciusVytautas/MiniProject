package it.akademija.Library.services;


import it.akademija.Library.Enums.Category;
import it.akademija.Library.Enums.Type;

import java.util.List;


public class InstitutionObject {


    private String title;
    private String city;
    private String image;
    private String category;
    private String type;

    private List<BooksDataObject> booksDataObject;

    public InstitutionObject(String title, String city, String image, String category, String type) {
        this.title = title;
        this.city = city;
        this.image = image;
        this.category = category;
        this.type = type;

    }



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<BooksDataObject> getBooksDataObject() {
        return booksDataObject;
    }

    public void setBooksDataObject(List<BooksDataObject> booksDataObject) {
        this.booksDataObject = booksDataObject;
    }
}
