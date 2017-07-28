package com.tomek;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class MyFrame extends JFrame {
    public MyFrame() {
        init();
    }

    public void init() {
        setTitle("Powitanie");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField nameTextField = new JTextField();
        JButton greetingButton = new JButton("Powitanie");
        JLabel greetinglabel = new JLabel("Witaj...");

        setLayout(new BoxLayout(getContentPane(), BoxLayout.PAGE_AXIS));

        greetingButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                greetinglabel.setText("Witaj " + nameTextField.getText());
            }
        });

        add(nameTextField);
        add(greetingButton);
        add(greetinglabel);

        pack();
    }
}
