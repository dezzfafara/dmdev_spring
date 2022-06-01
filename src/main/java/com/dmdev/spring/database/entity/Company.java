package com.dmdev.spring.database.entity;

public class Company {

    private Integer id;

    public Company(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Company: [id: " + id + "]";
    }
}
