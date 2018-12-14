package org.academiadecodigo.hackathon.models;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "achievement")
public class Achievement extends AbrastractModel{

    private String imgPath;
    private String name;
    private String description;

    @ManyToMany(
            mappedBy = "achievement",

            fetch = FetchType.EAGER
    )
    private List<User> users = new ArrayList<>();

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
}
