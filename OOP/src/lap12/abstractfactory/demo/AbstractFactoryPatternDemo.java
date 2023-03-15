package lap12.abstractfactory.demo;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = FactoryProducer.getFactory(false);
        Shape shape1 = abstractFactory.getShape("Rectangle");
        shape1.draw();
        Shape shape2 = abstractFactory.getShape("Square");
        shape2.draw();
        System.out.println("");

        AbstractFactory abstractFactory1 = FactoryProducer.getFactory(true);
        Shape shape3 = abstractFactory1.getShape("Rectangle");
        shape3.draw();
        Shape shape4 = abstractFactory1.getShape("Square");
        shape4.draw();
    }
}
