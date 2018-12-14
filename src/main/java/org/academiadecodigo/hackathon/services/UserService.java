package org.academiadecodigo.hackathon.services;

import org.academiadecodigo.hackathon.models.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    User getUserbyId(String username);

    Integer getUserPoints(String username);

    User addNewUser(User user);

    void removeUser(String username);

    User updateUser(User user);
}
