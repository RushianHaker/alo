package behavioral.chainOfResponsiable;

public class ConcrateHndlerA extends Handler {
    @Override
    public void handlerRequest(int request) {
        if (request == 1) {
            System.out.println("One");
        } else if (successor != null) {
            successor.handlerRequest(request);
        }
    }
}
