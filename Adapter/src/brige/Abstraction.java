package brige;

public class Abstraction {
    protected Implementor implementor = null;

    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    public void operation() {
        implementor.operationImpl();
    }
}
