package behavioral.state;

public class ConcrateStateB extends State {
    @Override
    public void handle(Context context) {
        context.setState(new ConcrateStateA());
        System.out.println(context.getState());
    }
}
