/*
* 7. (Poziom 2) Zaprojektuj interfejs Pojazd z metoda jedz oraz Motorówka z metoda płyń.
* Zaprojektuj klasę Amfibia, implemenujaca oba te interfejsy.
* */

public class Main {
    public static void main(String[] args) {
        Amphibian amphibian = new Amphibian();
        amphibian.drive();
        amphibian.swim();
    }
}
