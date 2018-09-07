package lesson6.homework6_1;

import java.sql.Blob;

public class Categories {
    private long CategoryID;
    private String CategoryName;
    private String Description;
    private Blob Picture;

    public Categories(long categoryID, String categoryName) {
        CategoryID = categoryID;
        CategoryName = categoryName;
    }

    public long getCategoryID() {
        return CategoryID;
    }

    public void setCategoryID(long categoryID) {
        CategoryID = categoryID;
    }

    public String getCategoryName() {
        return CategoryName;
    }

    public void setCategoryName(String categoryName) {
        CategoryName = categoryName;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public Blob getPicture() {
        return Picture;
    }

    public void setPicture(Blob picture) {
        Picture = picture;
    }
}
