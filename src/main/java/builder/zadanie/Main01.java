package builder.zadanie;

public class Main01 {
    public static void main(String[] args) {
        FlightLeg leg = new FlightLeg.FlightLegBuilder("Las Vegas", "Los Angeles").builderPrice(50).build();

        System.out.println(leg);

    }
}
