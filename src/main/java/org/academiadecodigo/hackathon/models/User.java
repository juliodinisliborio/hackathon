package org.academiadecodigo.hackathon.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Entity
@Table(name = "user")
public class User extends AbstractModel {

    //Attributes
    private String username;
    private String displayName;
    private String password;
    private String avatarPath;
    private Integer numberOfStealingAttempts;

    @OneToMany(
            mappedBy = "user"
    )
    private List<Friend> friends = new ArrayList<>();

    @ManyToMany(

            mappedBy = "users",

            // fetch achievements from database together with user
            fetch = FetchType.EAGER
    )
    private List<Achievement> achievements = new ArrayList<>();

    @ManyToMany(
            // user customer foreign key on account table to establish
            // the many-to-one relationship instead of a join table
            mappedBy = "users"
    )
    private Map<Place, Boolean> places = new HashMap<>();

    //Methods
    public void addFriend(Friend newFriend){
        friends.add(newFriend);
    }

    public void addAchievement(Achievement newAchievement){
        achievements.add(newAchievement);
    }

    public void addNewPlace(Place newPlace){
        places.put(newPlace, false);
    }

    public void incrementAttempts(){
        numberOfStealingAttempts++;
    }

    //Getters and Setters
    public List<Friend> getFriends() {
        return friends;
    }

    public void setFriends(List<Friend> friends) {
        this.friends = friends;
    }

    public List<Achievement> getAchievements() {
        return achievements;
    }

    public void setAchievements(List<Achievement> achievements) {
        this.achievements = achievements;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAvatarPath() {
        return avatarPath;
    }

    public void setAvatarPath(String avatarPath) {
        this.avatarPath = avatarPath;
    }

    public Integer getNumberOfStealingAttempts() {
        return numberOfStealingAttempts;
    }

    public void setNumberOfStealingAttempts(Integer numberOfStealingAttempts) {
        this.numberOfStealingAttempts = numberOfStealingAttempts;
    }

    public Map<Place, Boolean> getPlaces() {
        return places;
    }

    public void setPlaces(Map<Place, Boolean> places) {
        this.places = places;
    }
}
