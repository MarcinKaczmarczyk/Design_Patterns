package visitor.zadanie;

public class NameTransportVisitor implements TransportVisitor{
    @Override
    public void visit(Animal animal) {
        System.out.println("Animal kind: "+animal.getKind());
    }

    @Override
    public void visit(Person person) {
        System.out.println("Person name: "+person.getFirstName());
    }

    @Override
    public void visit(Shipment shipment) {
        System.out.println("Shipment designation: "+ shipment.getPrefix()+" "+shipment.getSerialNumber());
    }
}
