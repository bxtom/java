/*
* 5. (Poziom 2) Zaprojektuj hierarchię klas: klasę bazową Budynek z polami wysokosć, szerokosć i długosć oraz
* metode powierzchnia, zwracajaca iloczyn szerokosci i długosci; DomPiętrowy (rozszerza klasę budynek),
* przeciażajacy metodę powierzchnia (powierznię trzeba pomnożyć x 2 - bo mamy parter i piętro) oraz
* Wieżowiec (rozszerza klasę Budynek) z polem liczbaPięter, przeciażajacy metodę powierzchnia
* (powierzchnię trzeba pomnożyć przez (liczbę pięter + parter).
* */

public class Main {
    public static void main(String[] args) {
        Building building1 = new Building(30, 50, 20);
        System.out.println(building1.floorArea());
        StoreyBuilding building2 = new StoreyBuilding(30, 50, 40);
        System.out.println(building2.floorArea());
        Skyscraper building3 = new Skyscraper(30, 50, 100, 5);
        System.out.println(building3.floorArea());
    }
}
