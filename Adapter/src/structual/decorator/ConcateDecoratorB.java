package structual.decorator;

public class ConcateDecoratorB extends Decorator{

    public void addedBehavior(){
        System.out.println("Штаны");
    }

    @Override
    public void operation() {
        super.operation();
        addedBehavior();
    }
}
