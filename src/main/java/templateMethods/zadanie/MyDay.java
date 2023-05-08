package templateMethods.zadanie;

public class MyDay extends WeekDay {

    protected void work() {
        System.out.println("Code monkey get up, get coffee");
    }

    public int goToWork(TypeOfTransport transport) {
        switch(transport) {
            case CAR:
                return 15;
            case BIKE:
                return 25;
            case TRAM:
                return 21;
            default:
                return 20;
        }
    }
}