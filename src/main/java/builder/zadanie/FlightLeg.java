package builder.zadanie;

public class FlightLeg {
    private String from;
    private String to;
    private boolean delayed;
    private int price;

    private FlightLeg(FlightLegBuilder flightLeg) {
        this.from = flightLeg.from;
        this.to = flightLeg.to;
        this.delayed = flightLeg.delayed;
        this.price = flightLeg.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setDelayed(boolean delayed) {
        this.delayed = delayed;
    }

    @Override
    public String toString() {
        return "FlightLeg{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", delayed=" + delayed +
                ", price=" + price +
                '}';
    }

    public static class FlightLegBuilder {
        private String from;
        private String to;
        private boolean delayed;
        private int price;

        public FlightLegBuilder(String from, String to) {
            this.from = from;
            this.to = to;
            this.delayed = false;
        }

        public FlightLeg build() {
            if (this.price == 0) {
                throw new IllegalStateException("brak wymaganego pola");
            }
            return new FlightLeg(this);
        }

        public FlightLegBuilder builderPrice(int price) {
            this.price = price;
            return this;
        }
    }
}
