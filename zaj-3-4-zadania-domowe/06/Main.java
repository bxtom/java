/*
* 6. (Poziom 1) Zaprojektuj interfejs Narzędzie z metoda posłużSieNarzędziem(). Utwórz klasę Łopata,
* implementujaca interfejs Narzędzie. Realizacja metody posłużSięNarzędziem to wypisanie na ekran tekstu,
* np. "Łopata kopie rów". Utwórz podobne klasy implementujace interfejs Narzędzie: Piła,
* Grabie i Szczotka ze swoja wersja metody posłużSięNarzędziem.
* */

public class Main {
    public static void main(String[] args) {
        Shovel shovel = new Shovel();
        shovel.useTool();

        Saw saw = new Saw();
        saw.useTool();

        Rake rake = new Rake();
        rake.useTool();

        Brush brush = new Brush();
        brush.useTool();
    }
}
