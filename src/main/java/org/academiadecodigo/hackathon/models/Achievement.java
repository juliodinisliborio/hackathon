package org.academiadecodigo.hackathon.models;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "achievement")
public class Achievement extends AbstractModel {

    private String imgPath;
    private String name;
    private String description;
    private Integer points;
    private Boolean status;

    @ManyToMany(
            fetch = FetchType.EAGER
    )
    private List<User> user = new ArrayList<>();

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
