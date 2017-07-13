/*
* 13. (Poziom 3) Napisz metodę (w klasie CharCounter), liczącą liczbę wystąpienia znaku w tekście.
* Np. dla napisu "ala ma kota kot ma mleko" i literki "a" metoda zwróci wartość 5.
* Tip: możesz spróbować zrealizować zadanie używając metod contains, substring i indexOf klasy String.
* */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String string = "ala ma kota kot ma mleko";

        CharCounter charCounter = new CharCounter(string);
        System.out.println(charCounter.countChar('a'));
        System.out.println(charCounter.countChar2("a"));
        System.out.println(charCounter.countChar3("a"));
    }
}
