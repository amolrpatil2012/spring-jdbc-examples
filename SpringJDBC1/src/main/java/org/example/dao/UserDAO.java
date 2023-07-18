package org.example.dao;

import org.example.User;

import java.util.List;

public interface UserDAO {
    int insert (User user);
    User getUser(int id);
    List<User> getAllUsers();
}
