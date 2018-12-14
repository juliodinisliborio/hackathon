package org.academiadecodigo.hackathon.services;

import org.academiadecodigo.hackathon.models.Achievement;
import org.academiadecodigo.hackathon.models.User;

import java.util.List;

public interface AchievementService {

    List<Achievement> getUserAchievements(String username);

    List<Achievement> getFriendAchievements(Integer friendId);

    Achievement getAchievementById(Integer achievementId);

    Boolean getAchievementStatus(Achievement achievement, String username);
}
