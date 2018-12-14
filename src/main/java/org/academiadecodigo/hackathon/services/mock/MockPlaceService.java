package org.academiadecodigo.hackathon.services.mock;

import org.academiadecodigo.hackathon.models.Place;
import org.academiadecodigo.hackathon.models.Review;
import org.academiadecodigo.hackathon.services.PlaceService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MockPlaceService extends AbstractMockService<Place> implements PlaceService {

    @Override
    public List<Place> getAllPlaces() {
        List<Place> list = new ArrayList<>();

        list.addAll(modelMap.values());

        return list;
    }

    @Override
    public Place getPlaceById(Integer placeId) {
        return modelMap.get(placeId);
    }

    @Override
    public Place addPlace(Place place) {
        return modelMap.put(place.getId(), place);
    }

    @Override
    public List<Review> getPlaceReviews(Integer placeId) {
        List<Review> list = new ArrayList<>();

        list.addAll(modelMap.get(placeId).getReviews());

        return list;
    }

    @Override
    public void removeUserPlace(Integer placeId) {
        modelMap.remove(placeId);
    }
}
