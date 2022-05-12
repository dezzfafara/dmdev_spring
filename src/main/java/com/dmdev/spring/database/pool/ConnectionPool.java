package com.dmdev.spring.database.pool;

import org.springframework.beans.factory.InitializingBean;

import java.util.List;
import java.util.Map;

public class ConnectionPool implements InitializingBean {

    private final String userName;
    private final Integer poolSize;
    private final List<Object> args;
    private Map<String, Object> properties;

    public ConnectionPool(String userName, Integer poolSize, List<Object> args, Map<String, Object> properties) {
        this.userName = userName;
        this.poolSize = poolSize;
        this.args = args;
        this.properties = properties;
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

    private void init() {
        System.out.println("Init connection pool");
    }

    @Override
    public void afterPropertiesSet() {
        System.out.println("Properties set!");
    }

    private void destroy() {
        System.out.println("Destroy connection pool");
    }
}
