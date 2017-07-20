package com.tomek.logic;

import com.tomek.annotations.Author;
import com.tomek.annotations.Important;
import com.tomek.annotations.InPolish;

@Author(author = "Tomek")
public class User {

    @Important
    private String name;
    @Important
    private String lastName;
    private int age;

    public User(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    @InPolish(InPolish = "pobierzImie")
    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }
}
