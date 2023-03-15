package lap12.factorymethod.demo;

public class FruitFactory {
    public Fruit provideFruit(String type) {
        if (type.equals("Banana")) {
            return new Banana();
        } else if (type.equals("Apple")) {
            return new Apple();
        }
        return new Orange();
    }
}

