import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> liczbyUzytkownika = new ArrayList<>();
        System.out.println("Podaj 6 liczb");
        for (int i = 0; i < 6; i++) {
            liczbyUzytkownika.add(scanner.nextInt());
        }

        List<Integer> liczbyWylosowane = new ArrayList<>();
        Random generatorLiczbLosowych = new Random();
        for (int i = 0; i < 6; i++) {
            liczbyWylosowane.add(generatorLiczbLosowych.nextInt(48));
        }

        if (liczbyUzytkownika.containsAll(liczbyWylosowane)) {
            System.out.println("Wygrales.");
        }

        System.out.println("Twoje liczby to " + liczbyUzytkownika);
        System.out.println("Wylosowane liczby to " + liczbyWylosowane);
    }
}
