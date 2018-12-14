package org.academiadecodigo.hackathon.models.dao;

import org.academiadecodigo.hackathon.models.Achievement;
import org.academiadecodigo.hackathon.models.Friend;

import java.util.List;

public interface FriendDAO extends DAO<Friend> {
    Friend getById(Integer friendId);
}
