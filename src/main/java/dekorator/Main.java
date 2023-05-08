package dekorator;

public class Main {
    public static void main(String[] args) {
        generateMap();
    }

    private static void generateMap() {
//        Terrain terrain = new Terrain("Równina", 13);
//        Terrain terrain1 = new Terrain("Wzgórze", 43);
        Terrain terrain = new Plain();
        Terrain terrain1 = new Hill();
        Terrain terrain2 = new SwampDecorator(new Hill());
        Terrain terrain3 = new SwampDecorator(new ForestDecorator(new Hill()));
        Terrain terrain4 = new RoadDecorator(new Hill());

        System.out.println("SwampDecorator hill cost "+ terrain2.fuelCost());
        System.out.println("SwampDecorator forest plain cost "+ terrain3.fuelCost());
        System.out.println(terrain4.desc()+" "+ terrain4.fuelCost());
    }
}
