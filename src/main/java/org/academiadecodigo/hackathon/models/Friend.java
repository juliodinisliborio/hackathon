package org.academiadecodigo.hackathon.models;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "friend")
public class Friend {

    //Attributes
    private String displayName;
    private String avatarPath;
    private List<Achievement> achievements;
    private Integer numberOfStealingAttemps;
    private List<Place> successfulPlaces;

    @ManyToOne
    private User user;

    //Getters and Setters
    public Integer getNumberOfStealingAttemps() {
        return numberOfStealingAttemps;
    }

    public void setNumberOfStealingAttemps(Integer numberOfStealingAttemps) {
        this.numberOfStealingAttemps = numberOfStealingAttemps;
    }

    public List<Place> getSuccessfulPlaces() {
        return successfulPlaces;
    }

    public void setSuccessfulPlaces(List<Place> successfulPlaces) {
        this.successfulPlaces = successfulPlaces;
    }

    public List<Achievement> getAchievements() {
        return achievements;
    }

    public void setAchievements(List<Achievement> achievements) {
        this.achievements = achievements;
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

}

