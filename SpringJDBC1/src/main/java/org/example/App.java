package org.example;

import org.example.dao.UserDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        UserDAO userDAO = context.getBean("userDAO" ,UserDAO.class);
        //User user = new User(111,"a@b.com","AAA");
        //userDAO.insert(user);
        //System.out.println(userDAO.getUser(111).getEmail());
        List<User> users = userDAO.getAllUsers();
        for ( User user :users)
        {
            System.out.println(user.getEmail());
        }
    }
}
