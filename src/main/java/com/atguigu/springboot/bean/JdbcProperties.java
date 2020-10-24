package com.atguigu.springboot.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "spring.jdbc")
public class JdbcProperties {

    private DataSourceProperties3 datasource;
    private String type;

    public DataSourceProperties3 getDatasource() {
        return datasource;
    }

    public void setDatasource(DataSourceProperties3 datasource) {
        this.datasource = datasource;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "JdbcProperties{" +
                "datasource=" + datasource +
                ", type='" + type + '\'' +
                '}';
    }
}
