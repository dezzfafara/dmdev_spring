package com.dmdev.spring.database.pool;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;
import java.util.Map;

@Component("pool1")
public class ConnectionPool {

    private final String userName;
    private final Integer poolSize;
    private List<Object> args;
    private Map<String, Object> properties;

    public ConnectionPool(@Value("${db.username}") String userName, @Value("${db.pool.size}") Integer poolSize) {
        this.userName = userName;
        this.poolSize = poolSize;
    }

    public String getUserName() {
        return userName;
    }

    public Integer getPoolSize() {
        return poolSize;
    }

    public List<Object> getArgs() {
        return args;
    }

    public Map<String, Object> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, Object> properties) {
        this.properties = properties;
    }

    @PostConstruct
    private void init() {
        System.out.println("Init connection pool");
    }

    @PreDestroy
    private void destroy() {
        System.out.println("Destroy connection pool");
    }
}
