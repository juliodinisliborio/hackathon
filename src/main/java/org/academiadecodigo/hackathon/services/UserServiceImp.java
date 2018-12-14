package org.academiadecodigo.hackathon.services;

import org.academiadecodigo.hackathon.models.User;
import org.academiadecodigo.hackathon.models.dao.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService {

    private UserDAO userDAO;

    @Override
    public List<User> getAllUsers() {
        return userDAO.getAll();
    }

    @Override
    public User getUserbyId(String username) {
        return userDAO.findbyUsername(username);
    }

    @Override
    public Integer getUserPoints(String username) {
        return userDAO.findbyUsername(username).getNumberOfStealingAttempts();
    }

    @Override
    public User addNewUser(User user) {
        return userDAO.add(user);
    }

    @Override
    public void removeUser(String username) {
        userDAO.remove(userDAO.findbyUsername(username));
    }

    @Override
    public User updateUser(User user) {
        return userDAO.update(user);
    }

    @Autowired
    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }
}
