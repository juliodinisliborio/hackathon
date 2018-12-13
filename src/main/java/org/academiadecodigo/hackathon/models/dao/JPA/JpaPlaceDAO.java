package org.academiadecodigo.hackathon.models.dao.JPA;

import org.academiadecodigo.hackathon.models.Place;
import org.academiadecodigo.hackathon.models.dao.PlaceDAO;

public class JpaPlaceDAO extends JpaAbstractDAO<Place> implements PlaceDAO {

    public JpaPlaceDAO() {
        super(Place.class);
    }
}
