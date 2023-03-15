package lap7.ex1_6;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("Woof");
    }

    public void greets(Dog dog1) {
        System.out.println("Woooof");
    }
}
