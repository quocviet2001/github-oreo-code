package lap6.ex1_4;

public class Circle extends Shape {
    private double radius;

    public Circle() {
        super("blue", true);
        this.radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    public double getPerimeter() {
        return Math.PI * this.radius * 2;
    }

    @Override
    public String toString() {
        return "Circle[" + super.toString() +
                "radius = " + radius +
                ']';
    }
}
