package lap13.builder.pesudocode;

public class Director {
    public void constructSportCar(Builder builder) {
        builder.reset().setSeats(5).setEngine(new Engine(3.3, 0))
                .setTripComputer(new TripComputer()).setGPS(new GPS());
    }

    public void constructSUV(Builder builder) {
        builder.reset().setSeats(8)
                .setEngine(new Engine(6.5, 0))
                .setGPS(new GPS());
    }
}
