package org.academiadecodigo.hackathon.services;

import org.academiadecodigo.hackathon.models.Place;
import org.academiadecodigo.hackathon.models.Review;
import org.academiadecodigo.hackathon.models.User;

import java.util.List;
import java.util.Set;

public interface PlaceService {

    List<Place> getAllPlaces();

    Place getPlaceById(Integer placeId);

    Place addPlace(Place place);

    List<Review> getPlaceReviews(Integer placeId);

    void removeUserPlace(Integer placeId);

}
