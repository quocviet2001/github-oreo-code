package lap5.ex1_2;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle(1.1);
        System.out.println(circle1);

        Circle circle2 = new Circle();
        System.out.println(circle2);

        circle1.setRadius(2.2);
        System.out.println(circle1);
        System.out.println("Radius is: " + circle1.getRadius());
        System.out.printf("Area is: %.2f%n", circle1.getArea());
        System.out.printf("Circumference is: %.2f%n", circle1.getCircumference());

    }
}
