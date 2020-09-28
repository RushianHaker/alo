package structual.flyweight;

public class UnsharedConcreateFlyweight extends Flyweigth{

    int allState;

    @Override
    public void operation(int extrinsicState) {
        allState = extrinsicState;
    }
}
