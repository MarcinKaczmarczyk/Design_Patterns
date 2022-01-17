package builder.klasyczny;

public class HouseDirector {
    private HouseBuilder houseBuilder;

    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public void buildHouse(){
        houseBuilder.buildWalls();
        houseBuilder.buildGarage();
        houseBuilder.buildDoors();
        houseBuilder.buildRoof();
        houseBuilder.buildFloors();
        houseBuilder.buildRooms();
        houseBuilder.buildWindows();
    }
    public House getHouse(){
        return this.houseBuilder.getHouse();
    }
}
