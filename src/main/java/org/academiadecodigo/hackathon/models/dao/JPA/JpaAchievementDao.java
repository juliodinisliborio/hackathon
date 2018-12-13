package org.academiadecodigo.hackathon.models.dao.JPA;

import org.academiadecodigo.hackathon.models.Achievement;
import org.academiadecodigo.hackathon.models.dao.AchievementDAO;
import org.springframework.stereotype.Repository;

@Repository
public class JpaAchievementDao extends JpaAbstractDAO<Achievement> implements AchievementDAO {


    public JpaAchievementDao() {
        super(Achievement.class);
    }
}
