package com.tomek;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class WyswietlaczPlikow extends JFrame {
    public WyswietlaczPlikow() throws HeadlessException {
        init();
    }

    private void init() {
        setTitle("Wyswietlacz plikow");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700,700);
        setVisible(true);

        getContentPane().setLayout(new BorderLayout());

        JButton otworzPlik = new JButton("Otworz plik");
        getContentPane().add(otworzPlik, BorderLayout.SOUTH);

        JTextArea poleTekstowe = new JTextArea();
        getContentPane().add(poleTekstowe, BorderLayout.CENTER);

        otworzPlik.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser wybieraczPliku = new JFileChooser();
                if (wybieraczPliku.showOpenDialog(WyswietlaczPlikow.this) == JFileChooser.APPROVE_OPTION) {
                    File plik = wybieraczPliku.getSelectedFile();
                    String path = plik.getAbsolutePath();

                    try {
                        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
                            String plikZawartosc = "";
                            String linia;

                            while ((linia = reader.readLine()) != null) {
                                plikZawartosc += linia + "\n";
                            }

                            poleTekstowe.setText(plikZawartosc);
                        }
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                }
            }
        });
    }
}
