package org.example.dao;

import org.example.User;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class UserDAOImpl implements UserDAO {

    JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int insert (User user )
    {
        String sql = "Insert Into User Values ( ?,?,?)";
        return jdbcTemplate.update(sql,user.getId(),user.getName(),user.getEmail());

    }
    public  User getUser(int id )
    {
        String sql = "Select * From User where Id = ?";
        User user = jdbcTemplate.queryForObject(sql,new RowMapperImpl(),id);
        return user;
    }

    public List<User> getAllUsers()
    {
        String sql = "Select * From User";
        List<User> users = jdbcTemplate.query(sql,new RowMapperImpl());
        return users;

    }
}
