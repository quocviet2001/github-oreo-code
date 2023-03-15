package lap11.singleton.example;

public class BallSingleton {
    private static BallSingleton ball;
    private String color;
    private double radius;

    private BallSingleton(String color, double radius) {
        this.color = color;
        this.radius = radius;
    }

    public static BallSingleton getInstance(String color, double radius) {
        if (ball == null) {
            ball = new BallSingleton(color, radius);
        }
        return ball;
    }

    public String toString() {
        return "Ball[color = " + color + ", radius = " + radius + "]";
    }
}
