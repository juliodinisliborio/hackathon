package org.academiadecodigo.hackathon.models.dao;

import org.academiadecodigo.hackathon.models.Achievement;

public interface AchievementDAO extends DAO<Achievement> {
    Achievement getById(Integer achievementId);
}
