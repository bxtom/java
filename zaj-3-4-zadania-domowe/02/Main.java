/*
* 2. (Poziom 2) Zaprojektuj typ enum, składający się z nazw kilku marek telefonów. 
* Do każdej z marek powinno być przypisane pole przechowujące informację w formie 
* liczby całkowitej określające popularność danej marki (od 1 do 3). 
* Pobierz od użytkownika markę telefonu i wyświetl informację jak popularna jest 
* marka używając zdefiniowanego typu Enum.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Marki do wyboru");

        for(SmartphonesBrands brand : SmartphonesBrands.values())
            System.out.println(brand.getId() + " = " + brand.getName());

        System.out.print("Podaj numer wybranej marki: ");

        Scanner scanner = new Scanner(System.in);
        int selectedBrandId = scanner.nextInt();

        SmartphonesBrands brand = SmartphonesBrands.fromId(selectedBrandId);
        System.out.println("Popularnosc marki " + brand.getName() + " jest " + brand.getPopularityDescription());
    }
}
