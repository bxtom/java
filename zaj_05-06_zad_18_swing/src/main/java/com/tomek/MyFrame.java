package com.tomek;

import javax.swing.*;

public class MyFrame extends JFrame {
    public MyFrame() {
        init();
    }

    public void init() {
        setTitle("Powitanie");
        setSize(300, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(new JLabel("Czesc"));
    }
}
