package org.academiadecodigo.hackathon.services;

import org.academiadecodigo.hackathon.models.Friend;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FriendServiceImp implements FriendService {

    @Override
    public List<Friend> getUserFriendsList(Integer userId) {
        return null;
    }

    @Override
    public Friend getFriend(Integer userId, Integer friendsId) {
        return null;
    }

    @Override
    public Friend addFriendById(Integer friendId) {
        return null;
    }

    @Override
    public Boolean removeFriend(Friend friend) {
        return null;
    }

    @Override
    public Integer getFriendPoints(Integer userId, Integer friendId) {
        return null;
    }
}
