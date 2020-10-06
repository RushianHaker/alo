package exTest.com;

public abstract class Component {
    protected String name;

    public Component(String name) {
        this.name = name;
    }


    public abstract void operation();
    public abstract void add(Component component)throws Exception;
    public abstract void remove(Component component)throws Exception;
    public abstract Component getChild(int index) throws Exception;
}
