package exTest.com;

public class Leaf extends Component{

    public Leaf(String name) { super(name); }

    @Override
    public void operation() {
        System.out.println(name);
    }

    @Override
    public void add(Component component) throws Exception {
        throw new Exception(" WTF ?");
    }

    @Override
    public void remove(Component component) throws Exception {
        throw new Exception(" WTF ?");
    }

    @Override
    public Component getChild(int index) throws Exception {
        throw new Exception(" WTF ?");
    }
}
