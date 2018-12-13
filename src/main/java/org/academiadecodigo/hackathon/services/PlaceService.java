package org.academiadecodigo.hackathon.services;

import org.academiadecodigo.hackathon.models.Place;
import org.academiadecodigo.hackathon.models.Review;
import org.academiadecodigo.hackathon.models.User;

import java.util.List;

public interface PlaceService {

    List<Place> getUserPlaces(Integer userId);

    List<Place> getAllPlaces();

    Place getPlaceById(Integer placeId);

    Place addPlace(Place place);

    List<Review> getPlaceReviews(Place place);

    Boolean removeUserPlace(Place place, User user);

}
