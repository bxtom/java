package com.tomek;

public class User {
    private String firstName;
    private String lastName;
    private String age;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAge() {
        return age;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " " + age;
    }
}
