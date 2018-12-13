package org.academiadecodigo.hackathon.models.dao;

import org.academiadecodigo.hackathon.models.User;

public interface UserDAO extends DAO<User> {

    User findbyUsername(String username);
}
