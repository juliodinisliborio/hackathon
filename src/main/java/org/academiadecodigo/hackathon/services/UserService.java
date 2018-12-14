package org.academiadecodigo.hackathon.services;

import org.academiadecodigo.hackathon.models.Place;
import org.academiadecodigo.hackathon.models.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    List<Place> getUserPlaces(Integer id);

    User getUserbyId(Integer id);

    Integer getUserPoints(Integer id);

    User addNewUser(User user);

    void removeUser(Integer id);

    User updateUser(Integer id, User user);
}
