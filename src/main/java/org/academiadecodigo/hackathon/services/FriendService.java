package org.academiadecodigo.hackathon.services;

import org.academiadecodigo.hackathon.models.Friend;

import java.util.List;

public interface FriendService {

    List<Friend> getUserFriendsList(Integer userId);

    Friend getFriend(Integer userId, Integer friendsId);

    Friend addFriendById(Integer friendId);

    Boolean removeFriend(Friend friend);

    Integer getFriendPoints(Integer userId, Integer friendId);

}
