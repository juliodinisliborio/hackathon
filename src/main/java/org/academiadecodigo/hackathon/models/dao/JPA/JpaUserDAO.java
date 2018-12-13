package org.academiadecodigo.hackathon.models.dao.JPA;

import org.academiadecodigo.hackathon.models.User;
import org.academiadecodigo.hackathon.models.dao.UserDAO;
import org.springframework.stereotype.Repository;

@Repository
public class JpaUserDAO extends JpaAbstractDAO<User> implements UserDAO {

    public JpaUserDAO() {
        super(User.class);
    }
}
