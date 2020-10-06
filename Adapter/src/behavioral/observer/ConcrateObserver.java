package behavioral.observer;

public class ConcrateObserver extends Observer {

    private String observeState;
    private ConcreateSubject subject = null;

    public ConcrateObserver(ConcreateSubject subject) {
        this.subject = subject;
    }

    @Override
    public void update() {
        this.observeState = subject.getState();
    }
}
