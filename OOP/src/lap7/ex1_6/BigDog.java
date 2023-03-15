package lap7.ex1_6;

public class BigDog extends Dog {

    public BigDog(String name) {
        super(name);
    }

    @Override
    public void greets(Dog dog1) {
        System.out.println("Wooow");
    }

    @Override
    public void greets() {
        System.out.println("Woooooow");
    }

    public void greets(BigDog dog2) {
        System.out.println("Woooooooooow");
    }
}
