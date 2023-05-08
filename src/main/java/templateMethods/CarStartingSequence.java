package templateMethods;

public abstract class CarStartingSequence {

    public final void startTheCar(){
        fastenSeatbelts();
        startTheIgnition();
        setTheGear();
        go();
    }

    public abstract void setTheGear();

    public abstract void startTheIgnition();

    private void go(){
        System.out.println("Wciskamy gaz");
    }

    private void fastenSeatbelts(){
        System.out.println("Zapinamy pasy");
    }
}
