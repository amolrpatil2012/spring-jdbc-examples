package org.example.dao;

import org.example.User;

import java.util.List;

public interface UserDAO {

    public int insert(User user);
    List<User> getAllUsers();
}
