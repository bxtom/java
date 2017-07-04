package com.tomek.zadaniadomowe;

public class Animal {
    String name;
    int age;
    String species;

    public Animal(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", species='" + species + '\'' +
                '}';
    }

    public boolean isDangerous() {
        if (this.getSpecies().equals("Lew") ||
                this.getSpecies().equals("Tygrys") ||
                this.getSpecies().equals("Rekin")) {
            return true;
        } else return false;
    }
}
