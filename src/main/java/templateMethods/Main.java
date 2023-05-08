package templateMethods;

public class Main {
    public static void main(String[] args) {

        CarStartingSequence a=new AutomaticTransmitionStartingSequence();
        CarStartingSequence b=new ButtonCarStartingSequence();
        CarStartingSequence c=new ClassCarStartingSequence();
        a.startTheCar();
        System.out.println("____________");
        b.startTheCar();
        System.out.println("____________");
        c.startTheCar();
    }
}
