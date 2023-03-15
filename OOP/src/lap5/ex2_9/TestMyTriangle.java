package lap5.ex2_9;

public class TestMyTriangle {
    public static void main(String[] args) {
        MyTriangle triangle1 = new MyTriangle(5, 1, 8, 6, 4, 9);
        System.out.println(triangle1);
        System.out.printf("Perimeter is: %.2f%n", triangle1.getPerimeter());
        System.out.println(triangle1.getType());
        MyPoint point1 = new MyPoint(0, 0);
        MyPoint point2 = new MyPoint(0, 5);
        MyPoint point3 = new MyPoint(5, 0);
        MyTriangle myTriangle2 = new MyTriangle(point1, point2, point3);
        System.out.println(myTriangle2.getType());
    }
}
