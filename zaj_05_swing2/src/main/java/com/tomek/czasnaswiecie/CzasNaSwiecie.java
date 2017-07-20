package com.tomek.czasnaswiecie;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class CzasNaSwiecie extends JFrame {
    public CzasNaSwiecie() {
        init();
    }

    private void init() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Czas na swiecie");
        setSize(700, 500);
        setVisible(true);

        JLabel label = new JLabel("Wcisnij jakis przysisk");

        JButton czasParyzPrzycisk = new JButton("Czas w Paryżu");
        czasParyzPrzycisk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(czasW(ZoneId.of("Europe/Paris")));
            }
        });

        JButton czasTokioPrzycisk = new JButton("Czas w Tokio");
        czasTokioPrzycisk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(czasW(ZoneId.of("Asia/Tokyo")));

            }
        });

        JButton czasLosAngelesPrzycisk = new JButton("Czas w Los Angeles");
        czasLosAngelesPrzycisk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(czasW(ZoneId.of("America/Los_Angeles")));
            }
        });

        setLayout(new FlowLayout());

        getContentPane().add(label);
        getContentPane().add(czasParyzPrzycisk);
        getContentPane().add(czasTokioPrzycisk);
        getContentPane().add(czasLosAngelesPrzycisk);
    }

    private String czasW(ZoneId zoneId) {
        ZonedDateTime time = ZonedDateTime.now(zoneId);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
        return time.format(dateTimeFormatter);
    }
}
