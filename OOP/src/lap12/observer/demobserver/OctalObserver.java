package lap12.observer.demobserver;

public class OctalObserver extends Observer {
    private String octal;

    public OctalObserver(Subject subject) {
        super(subject);
        this.subject.attach(this);
    }
    public void update() {
        this.octal = convertOctal(subject.getState());
    }

    public String convertOctal(int value) {
        return Integer.toOctalString(value).toUpperCase();
    }

    public String toString() {
        return "Octal number: " + octal;
    }
}
