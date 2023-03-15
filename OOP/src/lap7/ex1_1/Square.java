package lap7.ex1_1;

public class Square extends Rectangle {

    public Square() {

    }

    public Square(double side) {
        this.width = side;
        this.length = side;
    }

    public Square(double side, String color, boolean filled) {
        this.length = side;
        this.width = side;
        this.color = color;
        this.filled = filled;
    }

    public double getSide() {
        return this.width;
    }

    public void setSide(double side) {
        this.length = side;
        this.width = side;
    }

    public void setWidth(double side) {
        this.width = side;
    }

    public void setLength(double side) {
        this.length = side;
    }

    public String toString() {
        return "Square[" + super.toString() + "]";
    }
}
