package lap6.ex1_4;

public class TestShape {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        Circle circle = new Circle("green", true, 2.0);
        System.out.println(circle);
        System.out.printf("Area: %.2f%n", circle.getArea());
        System.out.printf("Perimeter: ", circle.getPerimeter());

        Rectangle rectangle = new Rectangle("red", false, 3.0, 5.0);
        System.out.println(rectangle);
        System.out.printf("Area: %.2f%n", rectangle.getArea());
        System.out.printf("Perimeter: %.2f%n", rectangle.getPerimeter());

        Square square = new Square("pink", true, 6.0);
        System.out.println(square);
        System.out.printf("Area: %.2f%n", square.getArea());
        System.out.printf("Perimeter: %.2f%n", square.getPerimeter());
    }
}
