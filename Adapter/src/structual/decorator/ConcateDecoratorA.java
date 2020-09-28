package structual.decorator;

public class ConcateDecoratorA extends Decorator {
    public String addedState = "Майка";


    @Override
    public void operation() {
        super.operation();
        System.out.println(addedState);
    }
}
