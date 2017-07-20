package com.tomek;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class ListOfUsers extends JFrame {
    public ListOfUsers() {
        init();
    }

    public void init() {
        setTitle("Lista uzytkownikow");
        setSize(700, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        String dbPath = System.getProperty("user.dir") + "\\baza.txt";

        getContentPane().setLayout(new BorderLayout());

        JPanel panelCenter = new JPanel(new GridLayout(0, 3));
        getContentPane().add(panelCenter, BorderLayout.CENTER);

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(dbPath))) {
            String line = "";

            while ((line = bufferedReader.readLine()) != null) {
                String[] lineArray = line.split("\\s");

                panelCenter.add(new JLabel(lineArray[0]));
                panelCenter.add(new JLabel(lineArray[1]));
                panelCenter.add(new JLabel(lineArray[2]));

                validate();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        JPanel panetNorth = new JPanel(new GridLayout(1, 4));

        JTextField firstNameTextField = new JTextField();
        panetNorth.add(firstNameTextField);

        JTextField lastNameTextField = new JTextField();
        panetNorth.add(lastNameTextField);

        JTextField ageTextField = new JTextField();
        panetNorth.add(ageTextField);

        JButton buttonAdd = new JButton("Dodaj do bazy");
        buttonAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(dbPath, true))) {
                    User user = new User();

                    user.setFirstName(firstNameTextField.getText());
                    user.setLastName(lastNameTextField.getText());
                    user.setAge(ageTextField.getText());

                    bufferedWriter.write("\n" + user);

                    panelCenter.add(new JLabel(user.getFirstName()));
                    panelCenter.add(new JLabel(user.getLastName()));
                    panelCenter.add(new JLabel(user.getAge()));

                    revalidate();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        });
        panetNorth.add(buttonAdd);

        getContentPane().add(panetNorth, BorderLayout.NORTH);
    }
}
