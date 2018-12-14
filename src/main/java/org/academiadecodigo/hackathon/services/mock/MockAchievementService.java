package org.academiadecodigo.hackathon.services.mock;


import org.academiadecodigo.hackathon.models.Achievement;
import org.academiadecodigo.hackathon.services.AchievementService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MockAchievementService extends AbstractMockService<Achievement> implements AchievementService{

    private MockUserService mockUserService;

    @Override
    public List<Achievement> getUserAchievements(Integer id) {

        return mockUserService.getUserbyId(id).getAchievement();
    }

    @Override
    public Achievement getAchievementById(Integer achievementId) {
        return modelMap.get(achievementId);
    }

    @Override
    public Boolean getAchievementStatus(Achievement achievement, Integer userId) {
        return mockUserService.getUserbyId(userId).getAchievement().get(achievement.getId()).getStatus();
    }

    public void setMockUserService(MockUserService mockUserService) {
        this.mockUserService = mockUserService;
    }
}
