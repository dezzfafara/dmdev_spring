package com.dmdev.spring.ioc;

public class Container {

    public <T> T get(Class<T> clazz) {
        throw new UnsupportedOperationException(clazz.getName());
    }

}
