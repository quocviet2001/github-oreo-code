package lap6.ex1_5;

public class TestAnimal {
    public static void main(String[] args) {
        Animal animal = new Animal("Vit");
        System.out.println(animal);

        Mammal mammal = new Mammal("Pig");
        System.out.println(mammal);

        Cat cat1 = new Cat("Oreo");
        System.out.println(cat1);

        Dog dog = new Dog("Bob");
        System.out.println(dog);
    }
}
