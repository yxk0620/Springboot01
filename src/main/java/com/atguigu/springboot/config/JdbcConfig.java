package com.atguigu.springboot.config;


import com.atguigu.springboot.bean.DataSourceProperties3;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootConfiguration
public class JdbcConfig {

    @Bean
    //@ConfigurationProperties(prefix = "spring.jdbc.datasource")
    public DataSourceProperties3 createDataSourceProperties3(){

        return new DataSourceProperties3();
    }
}
