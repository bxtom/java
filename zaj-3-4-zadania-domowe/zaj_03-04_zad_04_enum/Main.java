/*
* 4. (Poziom 2) Zaprojektuj klasę Samochód z polem enum TypAuta, stwórz kilka obiektów tej klasy.
* Pole TypAuta powinno być inicjowane w konstruktorze.
* */

public class Main {
    public static void main(String[] args) {
        Car renault = new Car("Renault", CarType.PASSENGER_CAR);
        Car ford = new Car("Ford", CarType.TRUCK);
        Car ferrari = new Car("Ferrari", CarType.SPORTS_CAR);
    }
}
