package org.academiadecodigo.hackathon.services;

import org.academiadecodigo.hackathon.models.Achievement;
import org.academiadecodigo.hackathon.models.User;

import java.util.List;

public interface AchievementService {

    List<Achievement> getUserAchievements(User user);

    List<Achievement> getFriendAchievements(Integer friendId);

    Achievement getAchievementById(Integer achievementId);

    Boolean getAchivementStatus(Integer achievementId, User user);
}
