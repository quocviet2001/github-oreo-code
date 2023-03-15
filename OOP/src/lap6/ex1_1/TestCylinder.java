package lap6.ex1_1;

public class TestCylinder {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println(circle1);

        Cylinder cylinder1 = new Cylinder();
        System.out.println(cylinder1);
        System.out.println("base area: " + cylinder1.getArea());
        System.out.println("volume:" + cylinder1.getVolume());

        Cylinder cylinder2 = new Cylinder();
        Circle shape1 = (Circle) cylinder2;
        System.out.println(cylinder2);

        Cylinder cylinder3 = new Cylinder(3.0, "green", 4.0);
        System.out.println(cylinder3);
        System.out.println("radius: " + cylinder3.getRadius());
        System.out.println("color:" + cylinder3.getColor());
        System.out.println("height: " + cylinder3.getHeight());
        System.out.printf("area: %.2f%n", cylinder3.getArea());
        System.out.printf("volume: %.2f%n", cylinder3.getVolume());
    }
}
