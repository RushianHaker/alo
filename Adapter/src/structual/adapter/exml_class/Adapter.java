package structual.adapter.exml_class;

public class Adapter extends Adaptee implements ITarget{

    @Override
    public void request() {
        specificRequest();
    }
}
