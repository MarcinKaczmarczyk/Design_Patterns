package dekorator;

public class RoadDecorator extends TerrainDecorator{
    public RoadDecorator(Terrain terrain) {
        super(terrain);
    }

    @Override
    public int fuelCost() {
        return terrain.fuelCost()-10;
    }

    @Override
    public String desc() {
        return terrain.desc()+"przez które przebiega droga";
    }
}
