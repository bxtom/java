package com.tomek.window;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloSwing extends JFrame {
    public HelloSwing() throws HeadlessException {
        inicjalizacja();
    }

    private void inicjalizacja() {
        setTitle("Hello swing");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700, 500);
        Font font = new Font("Arial", Font.BOLD + Font.ITALIC, 24);

        GridLayout gridLayout = new GridLayout(1, 2);
        BorderLayout borderLayout = new BorderLayout();
        getContentPane().setLayout(borderLayout);

        JLabel lipton = new JLabel("Lipton");
        lipton.setFont(font);
        getContentPane().add(lipton, BorderLayout.NORTH);

        JTextField imieTextField = new JTextField();
        getContentPane().add(imieTextField, BorderLayout.SOUTH);

        JButton button = new JButton("Przycisk");
        getContentPane().add(button, BorderLayout.CENTER);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lipton.setText(imieTextField.getText());
            }
        });


        setVisible(true);
    }
}
