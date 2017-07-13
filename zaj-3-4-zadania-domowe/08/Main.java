/*
* 8. (Poziom 1) Utwórz zmienną klasy String, przypisz do niej wartość null.
* Następnie spróbuj wywołąć na zmiennej metodę length() - uruchom program i sprawdź, jaki wyjątek został rzucony.
* */

public class Main {
    public static void main(String[] args) {
        String string = new String();
        string = null;
        string.length();
    }
}
