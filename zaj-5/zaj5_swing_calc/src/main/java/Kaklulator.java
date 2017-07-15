import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Kaklulator extends JFrame {
    private Operacja operacja;
    private int liczba1;
    private int liczba2;

    public Kaklulator() throws HeadlessException {
        init();
    }

    private void init() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Kalkulator");
        setSize(700, 300);
        setVisible(true);

        setLayout(new GridLayout(4,3));

        JTextField textField = new JTextField();
        textField.setFont(new Font("Arial", Font.PLAIN, 24));
        getContentPane().add(textField);

        JButton button1 = new JButton("1");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "1");
            }
        });
        getContentPane().add(button1);

        JButton button2 = new JButton("2");
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "2");
            }
        });
        getContentPane().add(button2);

        JButton button3 = new JButton("3");
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "3");
            }
        });
        getContentPane().add(button3);

        JButton button4 = new JButton("4");
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "4");
            }
        });
        getContentPane().add(button4);

        JButton button5 = new JButton("5");
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "5");
            }
        });
        getContentPane().add(button5);

        JButton button6 = new JButton("6");
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "6");
            }
        });
        getContentPane().add(button6);

        JButton button7 = new JButton("7");
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "7");
            }
        });
        getContentPane().add(button7);

        JButton button8 = new JButton("8");
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "8");
            }
        });
        getContentPane().add(button8);

        JButton button9 = new JButton("9");
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "9");
            }
        });
        getContentPane().add(button9);

        JButton button0 = new JButton("0");
        button0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "0");
            }
        });
        getContentPane().add(button0);

        JButton buttonC = new JButton("C");
        buttonC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("");
            }
        });
        getContentPane().add(buttonC);

        JButton buttonPlus = new JButton("+");
        buttonPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setLiczba1(Integer.parseInt(textField.getText()));
                textField.setText("");
                setOperacja(Operacja.DODAWANIE);
            }
        });
        getContentPane().add(buttonPlus);

        JButton buttonMinus = new JButton("-");
        buttonMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setLiczba1(Integer.parseInt(textField.getText()));
                textField.setText("");
                setOperacja(Operacja.ODEJMOWANIE);
            }
        });
        getContentPane().add(buttonMinus);

        JButton buttonMnozenie = new JButton("*");
        buttonMnozenie.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setLiczba1(Integer.parseInt(textField.getText()));
                textField.setText("");
                setOperacja(Operacja.MNOZENIE);
            }
        });
        getContentPane().add(buttonMnozenie);

        JButton buttonDzielenie = new JButton("/");
        buttonDzielenie.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setLiczba1(Integer.parseInt(textField.getText()));
                textField.setText("");
                setOperacja(Operacja.DZIELENIE);
            }
        });
        getContentPane().add(buttonDzielenie);


        JButton buttonOblicz = new JButton("=");
        buttonOblicz.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setLiczba2(Integer.parseInt(textField.getText()));

                Integer wynik = 0;
                switch (operacja) {
                    case DODAWANIE:
                        wynik = liczba1 + liczba2;
                        break;
                    case ODEJMOWANIE:
                        wynik = liczba1 - liczba2;
                        break;
                    case MNOZENIE:
                        wynik = liczba1 * liczba2;
                        break;
                    case DZIELENIE:
                        wynik = liczba1 / liczba2;
                        break;
                }

                textField.setText(wynik.toString());
            }
        });
        getContentPane().add(buttonOblicz);


    }

    public void setOperacja(Operacja operacja) {
        this.operacja = operacja;
    }

    public void setLiczba1(int liczba1) {
        this.liczba1 = liczba1;
    }

    public void setLiczba2(int liczba2) {
        this.liczba2 = liczba2;
    }
}
