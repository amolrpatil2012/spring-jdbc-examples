package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@ComponentScan("org.example.dao")
public class JdbcConfig {

    @Bean
    public DataSource getDataSource()
    {
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/test");
        ds.setUsername("root");
        ds.setPassword("demodemo!");
        return ds;
    }
    @Bean
    public JdbcTemplate getJdbcTemplate()
    {
        return  new JdbcTemplate(getDataSource());
    }

}
