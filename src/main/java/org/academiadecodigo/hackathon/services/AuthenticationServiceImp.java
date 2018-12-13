package org.academiadecodigo.hackathon.services;

import org.academiadecodigo.hackathon.models.dao.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationServiceImp implements AuthenticationService {

    private UserDAO userDAO;

    @Override
    public Boolean authenticateUser(String username, String password) {

        return userDAO.findbyUsername(username).getPassword().equals(password);
    }

    @Autowired
    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }
}
