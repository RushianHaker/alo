package brige;

/*Паттерн Bridge(Описатель,тело) - позволяем отделить абстракцию от элементов ее реализации, так чтобы и абстроакцию и реслизацию можно было изменять независимо друг от друга

 Позволяет отделить абстракцию от реализации так чтобы и то и другое можно было именять незвисимо.

 -> Отделяет абстракию от реализации
 */

public class Main {
    public static void main(String[] args) {


        Abstraction abstraction = null;
        abstraction = new RefinedAbstaraction(new ConcreteImplementorA());
        abstraction.operation();

        abstraction = new RefinedAbstaraction(new ConcreteImplementorB());
        abstraction.operation();
    }
}
