package visitor.zadanie;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("dog", 30);
        Person person = new Person("Dawid", "Nowak", true);
        Shipment shipment = new Shipment("PL", "4325452", false);
        List<Transportable> transportableList = Arrays.asList(animal, person, shipment);

        NameTransportVisitor nameTransportVisitor=new NameTransportVisitor();
        PriceTransportVisitor priceTransportVisitor=new PriceTransportVisitor();

        transportableList.forEach(x->x.accept(priceTransportVisitor));
        System.out.println("_________________________________________");
        transportableList.forEach(x->x.accept(nameTransportVisitor));

    }
}
