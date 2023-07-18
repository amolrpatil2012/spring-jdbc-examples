package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        JdbcTemplate jdbcTemplate = context.getBean("jdbcTemplate",JdbcTemplate.class);

       // String sql = "Insert Into user (id,email,name) values(101,'a@b.com','amol')";
        //int result = jdbcTemplate.update(sql);
        //System.out.println("Record Inserted"+result);


    }
}
