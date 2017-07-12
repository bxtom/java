public class StoreyBuilding extends Building {
    public StoreyBuilding(int width, int lenght, int height) {
        super(width, lenght, height);
    }

    @Override
    public int floorArea() {
        return super.floorArea() * 2;
    }
}
