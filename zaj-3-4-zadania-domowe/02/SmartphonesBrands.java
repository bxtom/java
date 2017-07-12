public enum SmartphonesBrands {
    NOKIA(1, "Nokia", 1),
    HTC(2, "HTC", 1),
    SAMSUNG(3, "Samsung", 3),
    LG(4, "LG", 2),
    ONEPLUS(5, "OnePlus", 1),
    XIAOMI(6, "Xiaomi", 2),
    APPLE(7, "Apple", 3);

    private int id;
    private String name;
    private int popularity;

    SmartphonesBrands(int id, String name, int popularity) {
        this.id = id;
        this.name = name;
        this.popularity = popularity;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPopularity() {
        return popularity;
    }

    public String getPopularityDescription() {
        String description = "";

        switch (this.popularity) {
            case 1:
                description = "niewielka";
                break;
            case 2:
                description = "umiarkowana";
                break;
            case 3:
                description = "duża";
                break;
        }

        return description;
    }

    public static SmartphonesBrands fromId(int id) {
        for (SmartphonesBrands brand : SmartphonesBrands.values()) {
            if (brand.getId() == id) {
                return brand;
            }
        }
        return null;
    }

}
