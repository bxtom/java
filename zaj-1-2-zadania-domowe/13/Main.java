package com.tomek.zadaniadomowe;

/*
13. (Poziom 2) Napisz klasę Zwierzę z polami: String imie, int wiek, String gatunek. Oprócz standardowych
     metod (konstruktory, gettery, settery, equals, toString) dodaj metodę czyGrozny zwracajaca prawdę,
     jesli gatunek to "Lew", "Tygrys" lub "Rekin" i fałsz w przeciwnym wypdaku.
*/

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[5];

        animals[0] = new Animal("Zwierze 1", 11, "Lew");
        animals[1] = new Animal("Zwierze 2", 7, "Slon");
        animals[2] = new Animal("Zwierze 3", 40, "Rekin");
        animals[3] = new Animal("Zwierze 4", 4, "Wydra");
        animals[4] = new Animal("Zwierze 5", 15, "Tygrys");

        for (Animal animal : animals) {
            System.out.println(animal.toString());
            if (animal.isDangerous())
                System.out.println(animal.getName() + " jest niebezpieczny!");
        }
    }
}
