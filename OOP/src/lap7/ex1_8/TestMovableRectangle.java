package lap7.ex1_8;

public class TestMovableRectangle {
    public static void main(String[] args) {
        MovableRectangle movableRectangle = new MovableRectangle(5, 5, 6, 9, 2, 1);
        System.out.println(movableRectangle);
        movableRectangle.moveUp();
        movableRectangle.moveLeft();
        System.out.println(movableRectangle);
        movableRectangle.moveDown();
        movableRectangle.moveRight();
        System.out.println(movableRectangle);
    }
}
