package adapter.exml_object;

public class Adapter extends Target{

    Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
    adaptee.specifieRequest();
    }
}
