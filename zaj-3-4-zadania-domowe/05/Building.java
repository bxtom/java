public class Building {
    private int width;
    private int lenght;
    private int height;

    public Building(int width, int lenght, int height) {
        this.width = width;
        this.lenght = lenght;
        this.height = height;
    }

    public int floorArea() {
        return width * lenght;
    }
}
