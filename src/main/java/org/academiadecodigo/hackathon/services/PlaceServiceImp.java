package org.academiadecodigo.hackathon.services;

import org.academiadecodigo.hackathon.models.Place;
import org.academiadecodigo.hackathon.models.Review;
import org.academiadecodigo.hackathon.models.dao.PlaceDAO;
import org.academiadecodigo.hackathon.models.dao.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class PlaceServiceImp implements PlaceService {

    private PlaceDAO placeDAO;
    private UserDAO userDAO;

    @Override
    public Set<Place> getUserPlaces(String username) {
        return userDAO.findbyUsername(username).getPlaces().keySet();
    }

    @Override
    public List<Place> getAllPlaces() {
        return placeDAO.getAll();
    }

    @Override
    public Place getPlaceById(Integer placeId) {
        return placeDAO.getById(placeId);
    }

    @Override
    public Place addPlace(Place place) {
        return placeDAO.add(place);
    }

    @Override
    public List<Review> getPlaceReviews(Integer placeId) {
        return placeDAO.getById(placeId).getReviews();
    }

    @Override
    public void removeUserPlace(Integer placeId, String username) {
        userDAO.findbyUsername(username).getPlaces().remove(placeDAO.getById(placeId));
    }

    @Autowired
    public void setPlaceDAO(PlaceDAO placeDAO) {
        this.placeDAO = placeDAO;
    }

    @Autowired
    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }
}
