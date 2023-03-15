package lap11.strategy.example;

public class TestAnimal {
    public static void main(String[] args) {
        Animal animal = new Animal();

        animal.setSoundStrategy(new CatStrategy());
        animal.soundStrategy();

        animal.setSoundStrategy(new DuckStrategy());
        animal.soundStrategy();

        animal.setSoundStrategy(new DogStrategy());
        animal.soundStrategy();
    }
}
