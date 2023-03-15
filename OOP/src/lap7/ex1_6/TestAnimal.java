package lap7.ex1_6;

public class TestAnimal {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Oreo");
        cat1.greets();

        Dog dog1 = new Dog("Den");
        dog1.greets();
        dog1.greets(dog1);

        BigDog bigDog1 = new BigDog("Mun");
        bigDog1.greets();
        bigDog1.greets(dog1);
        bigDog1.greets(bigDog1);

    }
}
