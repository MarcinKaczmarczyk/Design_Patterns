package dekorator;

public class ForestDecorator extends TerrainDecorator {
    public ForestDecorator(Terrain terrain) {
        super(terrain);
    }

    public int fuelCost() {
        return terrain.fuelCost() + 5;
    }
}
