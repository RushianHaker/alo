package decorator;

/*      Паттерн (обертка) - динамический (входе выполнения программы)  добовляет объекту н6овые возможности
        (состояния и /или поведения). Композиция используемая при использовании реализации паттерна декоратор являеться
        гибкой альтернативой наследования(пораждению подтипов) с целью расширения фенкциональности.

        -> Добавляет объекту новые состояния и поведения
*/
public class Main {
    public static void main(String[] args) {
        Component component = new ConcateComponent();
        Decorator decoratorA = new ConcateDecoratorA();
        Decorator decoratorB= new ConcateDecoratorB();


        decoratorA.component = component;
        decoratorB.component = decoratorA;

        decoratorB.operation();

    }
}
