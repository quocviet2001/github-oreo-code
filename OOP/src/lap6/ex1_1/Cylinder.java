package lap6.ex1_1;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
        super(1.0, "white");
        this.height = 1.0;
    }

    public Cylinder(double radius) {
        super(radius);
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return 2 * super.getArea() + getCircumference() * this.height;
    }

    public double getVolume() {
        return super.getArea() * this.height;
    }

    @Override
    public String toString() {
        return "Cylinder[" + super.toString() +
                "height = " + height +
                ']';
    }
}
