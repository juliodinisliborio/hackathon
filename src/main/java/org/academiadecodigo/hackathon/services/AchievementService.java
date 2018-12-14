package org.academiadecodigo.hackathon.services;

import org.academiadecodigo.hackathon.models.Achievement;
import org.academiadecodigo.hackathon.models.User;

import java.util.List;

public interface AchievementService {

    List<Achievement> getUserAchievements(Integer id);

    Achievement getAchievementById(Integer achievementId);

    Boolean getAchievementStatus(Achievement achievement, Integer userId);
}
