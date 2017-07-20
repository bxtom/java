package com.tomek;

/*
* 20. (Poziom 1) Napisz aplikację wyswietlajaca użytkowników:
*
* Imię   |  Nazwisko   | Wiek
* Aga    |  Kowalska   | 27
* Michał |  Nowak      | 29
*
* (Możesz użyć JLabel i np. GridLayout, albo JList)
*
* Użytkownicy powinni być wczytywani z pliku tekstowego. Dodaj możliwość dodawania użytkowników do
* pliku trzeba utworzyć 3 pola JTextField imie, nazwisko i wiek oraz przycisk "Dodaj do bazy".
* Po dodaniu do bazy lista użytkowników powinna być aktualizowana (możesz wyczyscić zawartosć kontenera
* metoda removeAll() , a następnie na nowo dodać wczytane z pliku informacje o userach).
* */

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                ListOfUsers listOfUsers = new ListOfUsers();
            }
        });
    }
}
