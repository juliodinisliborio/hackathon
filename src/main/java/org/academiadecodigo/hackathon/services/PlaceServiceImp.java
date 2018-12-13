package org.academiadecodigo.hackathon.services;

import org.academiadecodigo.hackathon.models.Place;
import org.academiadecodigo.hackathon.models.Review;
import org.academiadecodigo.hackathon.models.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlaceServiceImp implements PlaceService {


    @Override
    public List<Place> getUserPlaces(Integer userId) {
        return null;
    }

    @Override
    public List<Place> getAllPlaces() {
        return null;
    }

    @Override
    public Place getPlaceById(Integer placeId) {
        return null;
    }

    @Override
    public Place addPlace(Place place) {
        return null;
    }

    @Override
    public List<Review> getPlaceReviews(Place place) {
        return null;
    }

    @Override
    public Boolean removeUserPlace(Place place, User user) {
        return null;
    }
}
