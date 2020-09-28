package structual.decorator;

public class Decorator extends Component {

    protected Component component;

    @Override
    public void operation() {
        if(component != null)
            component.operation();
    }
}
