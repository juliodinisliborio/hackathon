package org.academiadecodigo.hackathon.models.dao.JPA;

import org.academiadecodigo.hackathon.models.Achievement;
import org.academiadecodigo.hackathon.models.dao.AchievementDAO;

public class JpaAchievementDao extends JpaAbstractDAO<Achievement> implements AchievementDAO {


    public JpaAchievementDao() {
        super(Achievement.class);
    }
}
