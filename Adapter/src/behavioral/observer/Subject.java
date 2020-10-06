package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject { // издатель

    private List<Observer> args = new ArrayList<>();

    public void attach(Observer observer) {
        args.add(observer);
    }

    public void detach(Observer observer) {
        args.remove(observer);
    }

    public void notifyObserver(){
        for (Observer observer: args) {
            observer.update();
        }
    }
}
