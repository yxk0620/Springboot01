package com.atguigu.springboot.controller;


import com.atguigu.springboot.bean.DataSourceProperties;
import com.atguigu.springboot.bean.DataSourceProperties2;
import com.atguigu.springboot.bean.DataSourceProperties3;
import com.atguigu.springboot.bean.JdbcProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.sql.DataSource;


@RestController
//@EnableConfigurationProperties(DataSourceProperties2.class)
public class HelloController {

/*    @Autowired
    private DataSourceProperties dataSourceProperties;*/

    @Autowired
    DataSourceProperties2 dataSourceProperties2;

/*    @Autowired
    DataSourceProperties3 dataSourceProperties3;

    @Autowired
    JdbcProperties jdbcProperties;*/

    @Resource
    DataSource dataSource;

    @RequestMapping("/hello")
    public String sayHello(){

        System.out.println("DataSource="+dataSource.getClass().getName());

        return "hello,springboot";
    }


}
