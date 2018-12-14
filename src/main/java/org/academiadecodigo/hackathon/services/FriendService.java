package org.academiadecodigo.hackathon.services;

import org.academiadecodigo.hackathon.models.Friend;

import java.util.List;

public interface FriendService {

    List<Friend> getUserFriendsList(String username);

    Friend getFriend(String username, Integer friendsId);

    Friend addFriendById(String username, Friend friend);

    void removeFriend(Integer friendId);

    Integer getFriendStealingAttempts(String username, Integer friendId);

}
