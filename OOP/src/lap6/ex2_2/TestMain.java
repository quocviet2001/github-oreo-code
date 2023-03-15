package lap6.ex2_2;

public class TestMain {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0, "blue");
        System.out.println(circle);
        System.out.println("radius: " + circle.getRadius());
        System.out.println("color: " + circle.getColor());

        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        cylinder.setBase(circle);
        cylinder.setHeight(10.0);
        System.out.println("base: " + cylinder.getBase());
        System.out.println("height: " + cylinder.getHeight());
    }
}
