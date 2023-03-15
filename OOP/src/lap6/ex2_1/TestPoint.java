package lap6.ex2_1;

public class TestPoint {
    public static void main(String[] args) {
        Point point1 = new Point(5, 15);
        System.out.println(point1);
        point1.setXY(11, 21);
        System.out.println(point1);
        System.out.println("x = " + point1.getX());
        System.out.println("y = " + point1.getY());
    }
}
