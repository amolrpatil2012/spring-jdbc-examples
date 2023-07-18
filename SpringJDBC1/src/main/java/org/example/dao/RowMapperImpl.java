package org.example.dao;

import org.example.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RowMapperImpl implements RowMapper<User> {


    @Override
    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
        User user = new User();
        user.setId(rs.getInt(1));
        user.setEmail(rs.getString(2));
        user.setName(rs.getString(3));
        return user;
    }
}
