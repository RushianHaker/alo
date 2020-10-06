package exTest.com;

public class Main {

    public static void main(String[] args) throws Exception {
        Component root = new Composite("Root");
        Component branch1 = new Composite("Branch1");
        Component branch2 = new Composite("Branch2");

        Component leaf1 = new Leaf("leaf1");
        Component leaf2 = new Leaf("leaf2");

        root.add(branch1);
        root.add(branch2);

        branch1.add(leaf1);
        branch2.add(leaf2);

        root.operation();
    }
}
