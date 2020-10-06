package behavioral.state;


/**
 *      State (Состояние) Finite State Machine (Машина состояний или Конечный автомат)
 *
 *      Паттерн State - позволяет обьекту изменять свое поведение в зависимости от своего состояния. Поведение обьекта
 *      изменяется на столько, что создается впечатление, что изменился класс обьекта.
 *
 *      -> Описывает способы построения конечных автоматов.
 */


public class Main {
    public static void main(String[] args) {
        Context context = new Context(new ConcrateStateA());

        context.request();
        context.request();
    }
}
