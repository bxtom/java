package com.tomek;

import com.tomek.window.HelloSwing;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                HelloSwing helloSwing = new HelloSwing();
            }
        });
    }
}
