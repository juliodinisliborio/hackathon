package org.academiadecodigo.hackathon.models.dao.JPA;

import org.academiadecodigo.hackathon.models.User;
import org.academiadecodigo.hackathon.models.dao.UserDAO;

public class JpaUserDAO extends JpaAbstractDAO<User> implements UserDAO {

    public JpaUserDAO() {
        super(User.class);
    }
}
