package it.akademija.PracticeBeforeExam.services;

import it.akademija.Library.Enums.Category;
import it.akademija.Library.Enums.Type;

public class InstitutionTestObject {

    private String title;

    private Category category;

    private Type type;

    private String city;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public InstitutionTestObject(String title, Category category, Type type, String city) {
        this.title = title;
        this.category = category;
        this.type = type;
        this.city = city;
    }
}
