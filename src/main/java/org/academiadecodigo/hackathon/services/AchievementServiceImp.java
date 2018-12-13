package org.academiadecodigo.hackathon.services;

import org.academiadecodigo.hackathon.models.Achievement;
import org.academiadecodigo.hackathon.models.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AchievementServiceImp implements AchievementService {

    @Override
    public List<Achievement> getUserAchievements(User user) {
        return null;
    }

    @Override
    public List<Achievement> getFriendAchievements(Integer friendId) {
        return null;
    }

    @Override
    public Achievement getAchievementById(Integer achievementId) {
        return null;
    }

    @Override
    public Boolean getAchivementStatus(Integer achievementId, User user) {
        return null;
    }
}
