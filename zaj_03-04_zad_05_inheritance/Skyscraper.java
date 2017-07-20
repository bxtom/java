public class Skyscraper extends Building {
    private int numberOfFloors;

    public Skyscraper(int width, int lenght, int height, int numberOfFloors) {
        super(width, lenght, height);
        this.numberOfFloors = numberOfFloors;
    }

    public Skyscraper(int width, int lenght, int height) {
        super(width, lenght, height);
    }

    @Override
    public int floorArea() {
        return super.floorArea() * (numberOfFloors + 1);
    }
}
