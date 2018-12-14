package org.academiadecodigo.hackathon.models;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "friend")
public class Friend extends AbrastractModel{

    //Attributes
    private String displayName;
    private String avatarPath;
    private Integer userId;

    private Integer numberOfStealingAttempts;


    @ManyToOne
    private User user;

    //Getters and Setters
    public Integer getNumberOfStealingAttempts() {
        return numberOfStealingAttempts;
    }

    public void setNumberOfStealingAttempts(Integer numberOfStealingAttempts) {
        this.numberOfStealingAttempts = numberOfStealingAttempts;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getAvatarPath() {
        return avatarPath;
    }

    public void setAvatarPath(String avatarPath) {
        this.avatarPath = avatarPath;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}

