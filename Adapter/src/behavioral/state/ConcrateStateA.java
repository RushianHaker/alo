package behavioral.state;

public class ConcrateStateA extends State {
    @Override
    public void handle(Context context) {
        context.setState(new ConcrateStateB());
        System.out.println(context.getState());
    }
}
