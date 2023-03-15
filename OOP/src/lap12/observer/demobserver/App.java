package lap12.observer.demobserver;

public class App {
    public static void main(String[] args) {
        Subject subject = new Subject();
        BinaryObserver binaryObserver = new BinaryObserver(subject);
        OctalObserver octalObserver = new OctalObserver(subject);
        HecxaObserver hecxaObserver = new HecxaObserver(subject);

        int number = 12345678;
        subject.setState(number);
        System.out.println("Integer number: " + number);
        System.out.println(binaryObserver);
        System.out.println(octalObserver);
        System.out.println(hecxaObserver);
        System.out.println("");

        int number2 = 987654321;
        subject.setState(number2);
        System.out.println("Integer number: " + number2);
        System.out.println(binaryObserver);
        System.out.println(octalObserver);
        System.out.println(hecxaObserver);
    }
}
