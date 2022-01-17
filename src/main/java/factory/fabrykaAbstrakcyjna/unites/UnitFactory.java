package factory.fabrykaAbstrakcyjna.unites;

public class UnitFactory extends Factory {
    @Override
    public Unit createUnit(UnitType type) {

        switch (type){
            case TANK -> new Tank(200,0,20);
            case RIFLEMAN -> new Rifleman(100,0,10);
            default -> throw new UnsupportedOperationException("no such type");
        }
        return null;
    }
}
