package org.academiadecodigo.hackathon.services.mock;

import org.academiadecodigo.hackathon.models.User;
import org.academiadecodigo.hackathon.services.UserService;

import java.util.List;


public class MockUserService extends AbstractMockService<User> implements UserService {

    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public User getUserbyId(Integer userId) {
        return null;
    }

    @Override
    public Integer getUserPoints(Integer userId) {
        return null;
    }

    @Override
    public User addNewUser(User user) {
        return null;
    }

    @Override
    public Boolean removeUser(User user) {
        return null;
    }

    @Override
    public User updateUser(User user) {
        return null;
    }
}
