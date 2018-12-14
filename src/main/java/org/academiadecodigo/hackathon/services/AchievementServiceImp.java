package org.academiadecodigo.hackathon.services;

import org.academiadecodigo.hackathon.models.Achievement;
import org.academiadecodigo.hackathon.models.dao.AchievementDAO;
import org.academiadecodigo.hackathon.models.dao.FriendDAO;
import org.academiadecodigo.hackathon.models.dao.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AchievementServiceImp implements AchievementService {

    private AchievementDAO achievementDAO;
    private UserDAO userDAO;
    private FriendDAO friendDAO;

    @Override
    public List<Achievement> getUserAchievements(String username) {
        return userDAO.findbyUsername(username).getAchievement();
    }

    @Override
    public List<Achievement> getFriendAchievements(Integer friendId) {
        return userDAO.getbyId(friendDAO.getById(friendId).getUserId()).getAchievement();
    }

    @Override
    public Achievement getAchievementById(Integer achievementId) {
        return achievementDAO.getById(achievementId);
    }

    @Override
    public Boolean getAchievementStatus(Achievement achievement, String username) {
        return userDAO.findbyUsername(username).getAchievement().contains(achievement);
    }

    @Autowired
    public void setAchievementDAO(AchievementDAO achievementDAO) {
        this.achievementDAO = achievementDAO;
    }

    @Autowired
    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Autowired
    public void setFriendDAO(FriendDAO friendDAO) {
        this.friendDAO = friendDAO;
    }
}
