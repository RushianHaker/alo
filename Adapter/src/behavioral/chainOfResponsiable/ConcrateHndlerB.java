package behavioral.chainOfResponsiable;

public class ConcrateHndlerB extends Handler{
    @Override
    public void handlerRequest(int request) {
        if (request == 2) {
            System.out.println("Two");
        } else if (successor != null) {
            successor.handlerRequest(request);
        }
    }
}
