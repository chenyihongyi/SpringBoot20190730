package com.example.demo.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/**
 * @Author: Elvis
 * @Date: 2019/8/29 10:17
 */
@Configuration
public class DataSourceConfig {
    @Bean(name="dataSource")
    @ConfigurationProperties(prefix="spring.dataSource")
    public DataSource dataSource(){
        return new DruidDataSource();
    }

    @Bean(name="transactionManager")
    public DataSourceTransactionManager transactionManager(){
        return new DataSourceTransactionManager(dataSource());
    }
}
