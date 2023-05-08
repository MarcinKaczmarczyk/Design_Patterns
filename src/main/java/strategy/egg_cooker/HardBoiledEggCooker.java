package strategy.egg_cooker;

public class HardBoiledEggCooker implements EggCooker{
    @Override
    public void cookEgg() {
        System.out.println("gotuję jajka na twardo");
    }
}
