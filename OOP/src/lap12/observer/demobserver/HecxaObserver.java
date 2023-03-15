package lap12.observer.demobserver;

public class HecxaObserver extends Observer{
    private String hex;

    public HecxaObserver(Subject subject) {
        super(subject);
        subject.attach(this);
    }
    public void update(){
        this.hex = convertHex(subject.getState());
    }

    private String convertHex(int value) {
        return Integer.toHexString(value).toUpperCase();
    }

    public String toString() {
        return "Hexa number: " + hex;
    }
}
