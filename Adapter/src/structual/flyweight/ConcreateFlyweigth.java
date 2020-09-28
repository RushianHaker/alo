package structual.flyweight;

public class ConcreateFlyweigth extends Flyweigth{

    int initialiseState;

    @Override
    public void operation(int extrinsicState) {
        initialiseState = extrinsicState;
    }
}
