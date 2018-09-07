package lesson6.homework6_2;

import java.util.Date;

public class ForumPosts {
    private long id;
    private ForumSubcategories subcategory;
    private Users user;
    private ForumPosts parentPost;
    private String title;
    private String content;
    private boolean isPoll;
    private Date dateCreated;
    private String ip;

    public ForumPosts(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public ForumSubcategories getSubcategory() {
        return subcategory;
    }

    public void setSubcategory(ForumSubcategories subcategory) {
        this.subcategory = subcategory;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public ForumPosts getParentPost() {
        return parentPost;
    }

    public void setParentPost(ForumPosts parentPost) {
        this.parentPost = parentPost;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isPoll() {
        return isPoll;
    }

    public void setPoll(boolean poll) {
        isPoll = poll;
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
