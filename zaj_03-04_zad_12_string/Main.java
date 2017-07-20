/*
* 12. (Poziom 2) Zmień napis: "    stado owiec jeździ rowerem   " na "STADO KRÓW JEŹDZI"
* */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String string = "    stado owiec jeździ rowerem   ";
        string = string.trim().toUpperCase();
        string = string.replace("OWIEC", "KRÓW").replace(" ROWEREM", "");
        System.out.println(string);
    }
}
