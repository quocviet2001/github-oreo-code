package lap12.abstractfactory.demo;

public class ShapeFactory extends AbstractFactory {
    public Shape getShape(String type) {
        if (type.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        } else if (type.equalsIgnoreCase("square")) {
            return new Square();
        }
        return null;
    }

}
