package lap7.ex1_2;

public class TestMain {
    public static void main(String[] args) {
        Circle circle1 = new Circle(7.7);
        System.out.println(circle1);
        System.out.println("Area: " + circle1.getArea());
        System.out.println("Perimeter: " + circle1.getPerimeter());

        Rectangle rectangle1 = new Rectangle(2.0, 4.0);
        System.out.println(rectangle1);
        System.out.println("Area: " + rectangle1.getArea());
        System.out.println("Perimeter: " + rectangle1.getPerimeter());
    }
}
