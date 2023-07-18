package org.example.dao;

import org.example.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserDAOImpl implements UserDAO{

    @Autowired
    JdbcTemplate jdbcTemplate;
    @Override
    public int insert(User user) {
        return 0;
    }

    @Override
    public List<User> getAllUsers() {
        String sql = "Select * From User";
        return  jdbcTemplate.query(sql,new RowMapperImpl());

    }
}
