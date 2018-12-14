package org.academiadecodigo.hackathon.services.mock;

import org.academiadecodigo.hackathon.models.Friend;
import org.academiadecodigo.hackathon.services.FriendService;

import java.util.List;


public class MockFriendService extends AbstractMockService<Friend> implements FriendService {
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
