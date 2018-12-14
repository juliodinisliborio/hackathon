package org.academiadecodigo.hackathon.services;

import org.academiadecodigo.hackathon.models.Friend;
import org.academiadecodigo.hackathon.models.dao.FriendDAO;
import org.academiadecodigo.hackathon.models.dao.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FriendServiceImp implements FriendService {

    private UserDAO userDAO;
    private FriendDAO friendDAO;

    @Override
    public List<Friend> getUserFriendsList(String username) {
        return userDAO.findbyUsername(username).getFriends();
    }

    @Override
    public Friend getFriend(String username, Integer friendsId) {
        return userDAO.findbyUsername(username).getFriends().get(friendsId);
    }

    @Override
    public Friend addFriendById(String username, Friend friend) {
        return friendDAO.add(userDAO.findbyUsername(username).addFriend(friend));
    }

    @Override
    public void removeFriend(Integer friendId) {
        friendDAO.remove(friendDAO.getById(friendId));
    }

    @Override
    public Integer getFriendStealingAttempts(String username, Integer friendId) {
        return userDAO.findbyUsername(username).getFriends().get(friendId).getNumberOfStealingAttemps();
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
