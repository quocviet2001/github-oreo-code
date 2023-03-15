package lap12.factorymethod.demo;

public class App {
    public static void main(String[] args) {
        FruitFactory fruitFactory = new FruitFactory();
        Fruit fruit;

        fruit = fruitFactory.provideFruit("Apple");
        fruit.produceJuice();

        fruit = fruitFactory.provideFruit("Banana");
        fruit.produceJuice();

        fruit = fruitFactory.provideFruit("Orange");
        fruit.produceJuice();
    }
}
