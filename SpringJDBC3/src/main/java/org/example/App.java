package org.example;

import org.example.dao.UserDAOImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
        UserDAOImpl userDAO = context.getBean(UserDAOImpl.class);
        List<User> users = userDAO.getAllUsers();
        users.forEach(System.out::println);

    }
}
