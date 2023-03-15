package lap11.adapter.example;

public class App {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        System.out.println("The Duck says...");
        duck.quack();
        duck.fly();
        System.out.println("");

        Drone drone = new SkyDrone();
        Duck droneAdapter = new DroneAdapter(drone);
        System.out.println("The Drone's sound...");
        droneAdapter.quack();
        droneAdapter.fly();
    }
}
