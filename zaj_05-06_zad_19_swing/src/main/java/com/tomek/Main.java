package com.tomek;

/*
* 19. (Poziom 2) Utwórz aplikację wyswietlajaca okno, z polem, w którym można podać imię,
* a po nacisnięciu przycisku "Powitanie" zostanie wyswietlony napis "Czesć [imię]"
* */

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MyFrame myFrame = new MyFrame();
            }
        });
    }
}
