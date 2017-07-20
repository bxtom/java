package com.tomek;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                WyswietlaczPlikow wyswietlaczPlikow = new WyswietlaczPlikow();
            }
        });
    }
}
