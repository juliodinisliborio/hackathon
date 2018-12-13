package org.academiadecodigo.hackathon.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "place")
public class Place extends AbrastractModel{

    //Attributes
    private String mapPathForAPI;
    private Integer openingHour;
    private Integer closeHour;

    @OneToMany(
            mappedBy = "place",

            fetch = FetchType.EAGER
    )
    private List<Review> reviews;

    @ManyToMany(
            mappedBy = "places"
    )
    private List<User> users = new ArrayList<>();

    //Methods
    public void addReview (Review newReview){
        reviews.add(newReview);
    }

    //Getters and Setters
    public Integer getOpeningHour() {
        return openingHour;
    }

    public void setOpeningHour(Integer openingHour) {
        this.openingHour = openingHour;
    }

    public Integer getCloseHour() {
        return closeHour;
    }

    public void setCloseHour(Integer closeHour) {
        this.closeHour = closeHour;
    }

    public String getMapPathForAPI() {
        return mapPathForAPI;
    }

    public void setMapPathForAPI(String mapPathForAPI) {
        this.mapPathForAPI = mapPathForAPI;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }
}
