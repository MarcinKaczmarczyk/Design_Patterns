package dekorator;

abstract public class Terrain {

    private String desc;
    private int fuelCost;

    public Terrain(String desc, int fuelCost) {
        this.desc = desc;
        this.fuelCost = fuelCost;
    }

    public int fuelCost() {
        return fuelCost;
    }

    public String desc() {
        return desc;
    }
}
