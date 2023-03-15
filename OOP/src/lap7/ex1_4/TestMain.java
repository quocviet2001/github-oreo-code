package lap7.ex1_4;

public class TestMain {
    public static void main(String[] args) {
        MovablePoint movablePoint1 = new MovablePoint(6, 8, 1, 1);
        System.out.println(movablePoint1);
        movablePoint1.moveUp();
        System.out.println("After move up: " + movablePoint1);
        movablePoint1.moveLeft();
        System.out.println("After move left: " + movablePoint1);
        movablePoint1.moveDown();
        System.out.println("After move down: " + movablePoint1);
        movablePoint1.moveRight();
        System.out.println("After move right: " + movablePoint1);
        System.out.println(" ");

        MovableCircle movableCircle1 = new MovableCircle(22, 33, 2, 3, 8);
        System.out.println(movableCircle1);
        movablePoint1.moveUp();
        System.out.println("After move up: " + movableCircle1);
        movablePoint1.moveLeft();
        System.out.println("After move left: " + movableCircle1);
        movablePoint1.moveDown();
        System.out.println("After move down: " + movableCircle1);
        movablePoint1.moveRight();
        System.out.println("After move right: " + movableCircle1);
    }
}
