package lap12.abstractfactory.demo;

public class RoundedShapeFactory extends AbstractFactory {
    public Shape getShape(String type) {
        if (type.equalsIgnoreCase("rectangle")) {
            return new RoundedRectangle();
        } else if (type.equalsIgnoreCase("square")) {
            return new RoundedSquare();
        }
        return null;
    }
}
