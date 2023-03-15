package lap7.ex1_3;

public class TestMovable {
    public static void main(String[] args) {
        MovablePoint movablePoint1 = new MovablePoint(4, 5, 1, 2);
        System.out.println(movablePoint1);
        movablePoint1.moveUp();
        System.out.println("After move up: " + movablePoint1);
        movablePoint1.moveLeft();
        System.out.println("After move left: " + movablePoint1);
        movablePoint1.moveDown();
        System.out.println("After move down: " + movablePoint1);
        movablePoint1.moveRight();
        System.out.println("After move right: " + movablePoint1);
    }
}
