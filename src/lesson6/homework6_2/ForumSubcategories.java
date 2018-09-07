package lesson6.homework6_2;

import java.util.Date;

public class ForumSubcategories {
    private long id;
    private ForumCategories category;
    private String title;
    private String description;
    private Date dateCreated;
    private String ip;

    public ForumSubcategories(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public ForumCategories getCategory() {
        return category;
    }

    public void setCategory(ForumCategories category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
}
