public class Amphibian implements Motorboat, Vehicle {
    @Override
    public void drive() {
        System.out.println("Jedziemy");
    }

    @Override
    public void swim() {
        System.out.println("Plyniemy");
    }
}
