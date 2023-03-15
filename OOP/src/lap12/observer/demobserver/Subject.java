package lap12.observer.demobserver;
import java.util.LinkedList;
import java.util.List;
public class Subject {
    private List<Observer> observer;
    private int state;

    public Subject() {
        this.observer = new LinkedList<Observer>();
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        if(this.state == state) {
            return;
        }
        this.state = state;
        stateChange();
    }

    public void attach(Observer observer){
        this.observer.add(observer);
    }

    public void notifyAllObservers() {
        for (Observer observer1 : observer) {
            observer1.update();
        }
    }

    public void stateChange() {
        notifyAllObservers();
    }
}
