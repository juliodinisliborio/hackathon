package org.academiadecodigo.hackathon.services;

import org.academiadecodigo.hackathon.models.Friend;

import java.util.List;

public interface FriendService {

    List<Friend> getUserFriendsList(Integer userId);

    Friend getFriend(Integer userId, Integer friendsId);

    Friend addFriendById(Integer userId, Friend friend);

    void removeFriend(Integer userId, Integer friendId);

    Integer getFriendStealingAttempts(Integer userId, Integer friendId);

}
