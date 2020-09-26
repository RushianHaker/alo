package composite;

import jdk.nashorn.api.scripting.ScriptObjectMirror;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {

    private List<Component> nodes = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void operation() {
        System.out.println(name);

        for (Component node: nodes) {
            node.operation();
        }
    }

    @Override
    public void add(Component component) throws Exception {
        this.nodes.add(component);
    }

    @Override
    public void remove(Component component) throws Exception {
        this.nodes.remove(component);
    }

    @Override
    public Component getChild(int index) throws Exception {
        return this.nodes.get(index);
    }
}
