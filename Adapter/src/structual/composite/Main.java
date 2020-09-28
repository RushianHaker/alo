package structual.composite;

/*      Паттер (дерево)  - состовляет из объектов древовидные структуры для представления иерархии "честь-целое",
        Позволяет клиентам едионообразно трактовать индивидуальные объекты листья и составны объекты ветви.

        Постороение деревьев

 */
public class Main {
    public static void main(String[] args) throws Exception {


        //Если дерево не большой глубины, то используем Composite. Если же большая глубина и большое кол-во элементов,
        // то открываем книгу Д.Кнута

        Component root = new Composite("ROOT");
        Component branch1 = new Composite("BR1");
        Component branch2 = new Composite("BR2");

        Component leaf1 = new Leaf("LF1");
        Component leaf2 = new Leaf("LF2");

        root.add(branch1);
        root.add(branch2);

        branch1.add(leaf1);
        branch2.add(leaf2);

        root.operation();
    }
}
