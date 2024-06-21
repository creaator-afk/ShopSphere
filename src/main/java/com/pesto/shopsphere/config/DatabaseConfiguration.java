package com.pesto.shopsphere.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Configuration
public class DatabaseConfiguration {
    @Bean(name = "mysql")
    @Primary
    @ConfigurationProperties("spring.datasource.url")
    public DataSource getMysql(){
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "datasource2")
    @ConfigurationProperties("spring.data.mongodb.uri")
    public DataSource getMongo(){
        return DataSourceBuilder.create().build();
    }}
