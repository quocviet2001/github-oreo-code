package lap12.observer.demobserver;

public class BinaryObserver extends Observer {
    private String binary;

    public BinaryObserver(Subject subject) {
        super(subject);
        subject.attach(this);
    }

    public void update() {
        this.binary = convertBinary(subject.getState());
    }

    private String convertBinary(int value) {
        return Integer.toBinaryString(value).toUpperCase();
    }

    public String toString() {
        return "Binary number: " + binary;
    }
}
