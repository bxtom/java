import sun.security.krb5.JavaxSecurityAuthKerberosAccess;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Ala ").append("ma ");
        stringBuilder.append("kota  ");
        System.out.println(stringBuilder);

        // 4
        String input = "Ala ma kota";
        System.out.println(input.charAt(4));

        // 5
        System.out.println(input.startsWith("Ala"));
        System.out.println(input.endsWith("kota"));

        // 6
        String stringLitwa = "Litwo! ojczyzno moja!";
        System.out.println(stringLitwa.length());

        // 7
        String input7 = "abcdefgh";
        System.out.println(input7.indexOf("d"));

        // 8
        String input8 = "Ala ma kota, kot ma mleko";
        System.out.println(input8.substring(7, 12));

        // 9
        String input9 = "ala ma kota";
        String pattern = "ALA";
        System.out.println(input9.contains(pattern.toLowerCase()));

        // 10
        String input10a = "Ala ma kota";
        String input10b = "ALA MA KOTA";
        System.out.println(input10a.equalsIgnoreCase(input10b));

        // 11
        String input11 = "Ala ma kota";
        System.out.println(input11.replace("Ala", "Tadek"));

        // 12
        String input12 = "  Ala ma kota     ";
        System.out.println(input12.trim());

        // 13
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj imie");
        String imie = scanner.nextLine();
        System.out.println("podaj nazwisko");
        String nazwisko = scanner.nextLine();

        imie = imie.trim();
        nazwisko = nazwisko.trim();

        if (imie.toLowerCase().contains("jan"))
            imie = imie.replace("Jan", "Janek");

        if (nazwisko.length() > 10)
            nazwisko = nazwisko.substring(0, 9) + "...";

        System.out.println(imie);
        System.out.println(nazwisko);
    }
}
