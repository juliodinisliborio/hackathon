package org.academiadecodigo.hackathon.services.mock;

import org.academiadecodigo.hackathon.models.Achievement;
import org.academiadecodigo.hackathon.models.Place;
import org.academiadecodigo.hackathon.models.User;
import org.academiadecodigo.hackathon.models.dao.UserDAO;
import org.academiadecodigo.hackathon.services.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MockUserService extends AbstractMockService<User> implements UserService {


    @Override
    public List<User> getAllUsers() {

        List<User> list = new ArrayList<>();

        list.addAll(modelMap.values());

        return list;
    }

    @Override
    public List<Place> getUserPlaces(Integer id) {
        return getUserbyId(id).getPlace();
    }

    @Override
    public User getUserbyId(Integer id) {
        return modelMap.get(id);
    }

    @Override
    public Integer getUserPoints(Integer id) {
        Integer holder = 0; // :)

        for (Achievement achievement: modelMap.get(id).getAchievement()) {
            holder += achievement.getPoints();
        }

        return holder;
    }

    @Override
    public User addNewUser(User user) {
        return modelMap.put(user.getId(), user);
    }

    @Override
    public void removeUser(Integer id) {
        modelMap.remove(id);
    }

    @Override
    public User updateUser(Integer id, User user) {

        return modelMap.put(id, user);

    }

}
