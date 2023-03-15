package lap5.ex2_8;

public class TestCircle {
    public static void main(String[] args) {
        MyCircle circle1 = new MyCircle(2, 4, 5);
        MyCircle circle2 = new MyCircle(new MyPoint(2, 2), 6);
        System.out.println(circle1);
        System.out.println(circle2);
        circle1.setCenterX(9);
        System.out.println("CenterX is: " + circle1.getCenterX());
        circle1.setCenterY(7);
        System.out.println("CenterY is: " + circle1.getCenterY());
        circle1.setCenterXY(3, 8);
        System.out.println(circle1);
        System.out.printf("Area is: %.2f%n", circle1.getArea());
        System.out.printf("Circumference is: %.2f%n", circle1.Circumference());
        System.out.printf("Distance is: %.2f%n", circle1.distance(circle2));
    }

}
