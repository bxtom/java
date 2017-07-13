/*
* 9. (Poziom 1) Obsłuż wyjątek z powyższego zadania - wypisz na ekranie "Zanim wywołasz metodę,
* sprawdź czy zmienna nie jest nullem!" w bloku catch obsługującym wyjątek.
* Dodaj block finally tak, żeby zawsze wypisywany był tekst "Teraz mogę w spokoju skończyć program..."
* */

public class Main {
    public static void main(String[] args) {
        String string = new String();
        string = null;

        try {
            System.out.println(string.length());
        } catch (NullPointerException e) {
            System.out.println("Zanim wywołasz metodę, sprawdź czy zmienna nie jest nullem!");
        } finally {
            System.out.println("Teraz mogę w spokoju skończyć program...");
        }
    }
}
