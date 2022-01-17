package builder.zKlasaWewnetrzna;

public class Main {
    public static void main(String[] args) {
        House house=new House.HouseBuilder()
                .buildRoof("roof")
                .buildRooms("rooms")
                .buildWindows("window")
                .build();


        System.out.println(house);
    }
}
