package com.pluralsight.config;


import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
@Configuration
public class AppConfig {
    private final BasicDataSource basicDataSource;
    @Bean
    public DataSource dataSource(){
        return basicDataSource;
    }
    @Autowired
    public AppConfig(@Value("${datasource.url}")String url,
                     @Value("${datasource.username}")String username,
                     @Value("${datasource.password} ") String password){
        basicDataSource = new BasicDataSource();
        basicDataSource.setUrl(url);
        basicDataSource.setUsername(username);
        basicDataSource.setPassword(password);
    }
}
