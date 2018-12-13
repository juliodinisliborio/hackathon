package org.academiadecodigo.hackathon.models.dao.JPA;

import org.academiadecodigo.hackathon.models.Friend;
import org.academiadecodigo.hackathon.models.dao.FriendDAO;

public class JpaFriendDAO extends JpaAbstractDAO<Friend> implements FriendDAO {

    public JpaFriendDAO() {
        super(Friend.class);
    }
}
