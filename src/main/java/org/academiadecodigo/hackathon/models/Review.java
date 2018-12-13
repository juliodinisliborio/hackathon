package org.academiadecodigo.hackathon.models;

import javax.persistence.*;

@Entity
@Table(name = "review")
public class Review {

    //Attributes
    private Integer levelOfCameras;
    private Integer numberOfSecurityGuards;
    private Integer treasureValueOneToFive;
    private String  thiefComment;

    @ManyToOne
    private Place place;

    //Getters and Setters
    public Integer getLevelOfCameras() {
        return levelOfCameras;
    }

    public void setLevelOfCameras(Integer levelOfCameras) {
        this.levelOfCameras = levelOfCameras;
    }

    public Integer getNumberOfSecurityGuards() {
        return numberOfSecurityGuards;
    }

    public void setNumberOfSecurityGuards(Integer numberOfSecurityGuards) {
        this.numberOfSecurityGuards = numberOfSecurityGuards;
    }

    public Integer getTreasureValueOneToFive() {
        return treasureValueOneToFive;
    }

    public void setTreasureValueOneToFive(Integer treasureValueOneToFive) {
        this.treasureValueOneToFive = treasureValueOneToFive;
    }

    public String getThiefComment() {
        return thiefComment;
    }

    public void setThiefComment(String thiefComment) {
        this.thiefComment = thiefComment;
    }
}

