package lap11.singleton.example;

public class TestBall {
    public static void main(String[] args) {
        BallSingleton ball1 = BallSingleton.getInstance("red", 6);
        System.out.println(ball1);

        BallSingleton ball2 = BallSingleton.getInstance("green", 7);
        System.out.println(ball2);
    }
}
