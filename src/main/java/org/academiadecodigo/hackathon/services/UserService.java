package org.academiadecodigo.hackathon.services;

import org.academiadecodigo.hackathon.models.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    User getUserbyId(Integer userId);

    Integer getUserPoints(Integer userId);

    User addNewUser(User user);

    Boolean removeUser(User user);

    User updateUser(User user);
}
