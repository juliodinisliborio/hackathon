package org.academiadecodigo.hackathon.services.mock;

import org.academiadecodigo.hackathon.models.Friend;
import org.academiadecodigo.hackathon.services.FriendService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MockFriendService extends AbstractMockService<Friend> implements FriendService {


    private MockUserService mockUserService;

    @Override
    public List<Friend> getUserFriendsList(Integer userId) {

        return mockUserService.getUserbyId(userId).getFriends();
    }

    @Override
    public Friend getFriend(Integer userId, Integer friendsId) {

        return mockUserService.getUserbyId(userId).getFriends().get(friendsId);
    }

    @Override
    public Friend addFriendById(Integer userId, Friend friend) {

        return mockUserService.getUserbyId(userId).addFriend(friend);
    }

    @Override
    public void removeFriend(Integer userId, Integer friendId) {

        mockUserService.getUserbyId(userId).getFriends().remove(getFriend(userId,friendId));
    }

    @Override
    public Integer getFriendStealingAttempts(Integer userId, Integer friendId) {

        return mockUserService.getUserbyId(userId).getFriends().get(friendId).getNumberOfStealingAttempts();
    }

    public void setMockUserService(MockUserService mockUserService) {
        this.mockUserService = mockUserService;
    }
}
