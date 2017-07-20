package com.tomek.app.logic;

public class User {
    private String name;
    private String lastName;

    public User(String name, String lastName) {
        if (name == null || lastName == null) {
            throw new IllegalArgumentException("Name lub lastname nie może byc null!");
        }
        this.name = name;
        this.lastName = lastName;
    }
}
