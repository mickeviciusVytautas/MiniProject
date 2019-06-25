package it.akademija.Library.entities;


import it.akademija.Library.Enums.Category;
import it.akademija.Library.Enums.Type;

import javax.persistence.*;
import java.util.List;

@Entity
public class Institution {

    public Institution(){};

    public Institution(String title, String city, String image,
                       String category, String type, List<BooksData> booksData) {
        this.title = title;
        this.city = city;
        this.image = image;
        this.category = category;
        this.type = type;
        this.booksData = booksData;
    }

    @Id
    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String city;

    @Column(nullable = false)
    private String image;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private String type;

    //    @JoinColumn(name="institution_Id")
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "institution")
    private List<BooksData> booksData;

    public void addBookInInstitution(BooksData booksData){
        this.booksData.add(booksData);
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

    public List<BooksData> getBooksData() {
        return booksData;
    }

    public void setBooksData(List<BooksData> booksData) {
        this.booksData = booksData;
    }
}
