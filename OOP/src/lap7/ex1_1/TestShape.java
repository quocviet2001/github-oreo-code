package lap7.ex1_1;

import com.sun.security.jgss.GSSUtil;

public class TestShape {
    public static void main(String[] args) {
        Shape shape1 = new Circle(5.5, "red", false);
        System.out.println(shape1);
        System.out.println("Area: " + shape1.getArea());
        System.out.println("Perimeter: " + shape1.getPerimeter());
        System.out.println("Color: " + shape1.getColor());
        System.out.println("Filled: " + shape1.isFilled());
//        System.out.println("Radius: " + shape1.getRadius()); //Shape is not Circle and do not use behavior only in Circle.

        Circle circle1 = (Circle) shape1;
        System.out.println(circle1);
        System.out.println("Radius: " + circle1.getRadius());
        System.out.println("Color: " + circle1.getColor());
        System.out.println("Filled: " + circle1.isFilled());
        System.out.println("Area: " + circle1.getArea());
        System.out.println("Perimeter: " + circle1.getPerimeter());

        Shape shape2 = new Rectangle("red", true, 1.0, 2.0);
        System.out.println(shape2);
        System.out.println(shape2.getArea());
        System.out.println(shape2.getPerimeter());
        System.out.println(shape2.getColor());

        Rectangle rectangle1 = (Rectangle) shape2;
        System.out.println(rectangle1);
        System.out.println(rectangle1.getArea());
        System.out.println(rectangle1.getPerimeter());
        System.out.println(rectangle1.getColor());
        System.out.println(rectangle1.getLength());

        Shape shape3 = new Square(6.6);
        Square square1 = (Square) shape3;
        System.out.println(square1);
        System.out.println(square1.getArea());
        System.out.println(square1.getPerimeter());
        System.out.println(square1.getColor());
        System.out.println(square1.getSide());
        System.out.println(square1.getLength());
    }
}
