package adapter;

public class Main {
    public static void main(String[] args) {

        ContinentalDevice radio=new ContinentalDevice() {
            @Override
            public void on() {
                System.out.println("Gra muzyka");
            }
        };
        ContinentalSocket continentalSocket = new ContinentalSocket();
        continentalSocket.plugIn(radio);

        UKDevice ukRadio = new UKDevice() {
            @Override
            public void powerOn() {
                System.out.println("Londyn płonie");
            }
        };

        UKSocket ukSocket=new UKSocket();

        ukSocket.plugIn(ukRadio);

        UKToContinentalAdapter adapter = new UKToContinentalAdapter(ukRadio);
        continentalSocket.plugIn(adapter);

//        TWO WAY ADAPTER

        ContinentalDevice radio2=new ContinentalDevice() {
            @Override
            public void on() {
                System.out.println("London calling to the underworld ");
            }
        };
        UKDevice ukRadio2 = new UKDevice() {
            @Override
            public void powerOn() {
                System.out.println("London calling to the faraway towns");
            }
        };

        TwoWayAdapter twoWayAdapter=new TwoWayAdapter(ukRadio2, radio2);

        continentalSocket.plugIn(twoWayAdapter);
        ukSocket.plugIn(twoWayAdapter);
    }
}
