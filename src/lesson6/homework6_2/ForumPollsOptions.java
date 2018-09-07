package lesson6.homework6_2;

import java.util.Date;

public class ForumPollsOptions {
    private long id;
    private ForumPosts post;
    private String title;
    private Date dateCreated;

    public ForumPollsOptions(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public ForumPosts getPost() {
        return post;
    }

    public void setPost(ForumPosts post) {
        this.post = post;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
}
