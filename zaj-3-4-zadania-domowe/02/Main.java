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
