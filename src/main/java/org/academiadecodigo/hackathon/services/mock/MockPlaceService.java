package org.academiadecodigo.hackathon.services.mock;

import org.academiadecodigo.hackathon.models.Place;
import org.academiadecodigo.hackathon.models.Review;
import org.academiadecodigo.hackathon.models.User;
import org.academiadecodigo.hackathon.services.PlaceService;

import java.util.List;


public class MockPlaceService extends AbstractMockService<Place> implements PlaceService {
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
