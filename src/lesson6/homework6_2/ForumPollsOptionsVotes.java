package lesson6.homework6_2;

import java.util.Date;

public class ForumPollsOptionsVotes {
    private long id;
    private ForumPollsOptions pollOption;
    private Users uaser;
    private Date dateCreated;
    private String ip;

    public ForumPollsOptionsVotes(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public ForumPollsOptions getPollOption() {
        return pollOption;
    }

    public void setPollOption(ForumPollsOptions pollOption) {
        this.pollOption = pollOption;
    }

    public Users getUaser() {
        return uaser;
    }

    public void setUaser(Users uaser) {
        this.uaser = uaser;
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
