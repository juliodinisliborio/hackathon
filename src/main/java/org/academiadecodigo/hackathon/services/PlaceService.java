package org.academiadecodigo.hackathon.services;

import org.academiadecodigo.hackathon.models.Place;
import org.academiadecodigo.hackathon.models.User;

import java.util.List;

public interface PlaceService {

    List<Place> getUserPlaces(Integer userId);

    List<Place> getFriendsPlaces(Integer friendsId, Integer userId);

    Place getPlaceById(Integer userId, Integer goalId);

    Place addPlace(Place place);

    Place editPlace(Place place);

    Boolean removeUserPlace(Place place, User user);

}
