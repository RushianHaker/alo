package behavioral.chainOfResponsiable;

public abstract class Handler {
    protected Handler successor;
    public abstract void handlerRequest(int request);
}
