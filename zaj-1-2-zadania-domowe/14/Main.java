package com.tomek.zadaniadomowe;

/*
14. (Poziom 3) Napisz program, w skład którego wejda klasy Samochód, Silnik i Koła.
    Samochód powinien posiadać pola:
    - nazwę modelu
    - 4 obiekty typu koła w tablicy
    - silnik
    oraz metody:
    - uruchom() (wypisuje na ekranie napis "Samochód [nazwa modelu]: uruchamiam",
    wywołuje metodę uruchom() obiektu silnik)
    - zgas() (wypisuje na ekranie napis "Samochód [nazwa modelu]: zatrzymuję", wywołuje metodę zgas() obiektu silnik)
    - jedzDoPrzodu() (wypisuje na ekranie napis "Samochód [nazwa modelu]: jadę do przodu", wywołuje metodę dodajGazu()
    obiektu silnik, oraz krecDoPrzodu(obroty) obiektów koła)
    - jedzDoTyłu() (wypisuje na ekranie napis "Samochód [nazwa modelu]: jadę do tyłu", wywołuje metodę
    dodajGazu() obiektu silnik, oraz krecDoTylu() obiektów kół)
    - skrec(String kierunek) (parametr strona może przyjać wartosci: "prawo" i "lewo", w zależnosci od tego:
            wypisuje na ekranie napis "Samochód [nazwa modelu]: skręcam w [kierunek]",
            wywołuję metodę skrec(String kierunek) obiektów kół przednich)

    Silnik powinien posiadać pola:
    - stała maxObroty
    - aktualneObroty
    oraz metody:
    - uruchom() (wypisuje na ekranie napis "Silnik: uruchamiam", ustawia obroty na 1000)
    - zgas() (wypisuje na ekranie napis "Silnik: zatrzymuję", ustawia obroty na 1000)
    - dodajGazu() (dodaje do aktualnych obrotów 500, wypisuje na ekranie napis "Silnik: daję gazu!
    Aktualne obroty: [aktualneObroty]", jednoczesnie sprawdza czy nie przekroczone zostały maksymalne obroty.
    Jesli tak wypisuje na ekran "Za bardzo gazujesz!! Zaraz wybuchnę!!!")

    Koło powinno posiadać pola:
    - pozycja ("prawe", "lewe")
    - przednie (prawda/fałsz)
    - srednica (w centymetrach)
    oraz metody:
    - (prywatna) obliczPredkosc(int obrotySilnika) - oblicza prędkosć koła na podstawie obrotów i
    wielkosci koła wg wzoru: 2*Pi*100*srednica*(obrotySilnika/5000)
    - krecDoPrzodu() (wypisuje na ekranie napis "[lewe/prawe] [przednie/tylne] koło: kręcę do przodu!
    Aktualna prędkosć: [obliczPredkosc] km/h!")
    - krecDoTylu() (wypisuje na ekranie napis "[lewe/prawe] [przednie/tylne] koło: kręcę do tylu!")
    - skrec(String kierunek) (wypisuje na ekranie napis "[lewe/prawe] [przednie/tylne] koło: skręcam w [lewo/prawo]")

   w metodzie main:
   - utwórz samochód
   - uruchom
   - jedzDoPrzodu
   - skręć w prawo
   - skręć w lewo
   - jede do przodu
   - jede do tyłu
   - zgas

*/

public class Main {

    public static void main(String[] args) {
        Car car = new Car("Opel");
        car.start();
        car.driveForward();
        car.turn("prawo");
        car.turn("lewo");
        car.driveBackward();
        car.getEngine().increaseSpeed();
        car.getEngine().increaseSpeed();
        car.getEngine().increaseSpeed();
        car.getEngine().decreaseSpeed();
        car.stop();
    }
}
