package behavioral.chainOfResponsiable;

/*
    Паттерн (Цепочка обязоностей) - позволяет избежать привязки отправителя запросов
    к обекту получателю запроса, при этом давая этот запрос нескольким объектам.
    Паттерн связывает в цепочку объекты получатели запроса и передает запрос в доль этой цепочки, пока
    один из объектов состовляющих эту цепочку не обработает передаваемый запрос.


    (Короткое определение) Позволяет избежать привязки объекта отправителя запроса к его получателю,
    давая шанс обработать этот запрос несколькими объектам.
    Связывает в цепочку объекты получетели запроса и передает его вдоль этой цепочки, пока его не обработают.


     -> Создает цепочки из обработчиков запросов
**/

public class Main {
    public static void main(String[] args) {
        Handler h1 = new ConcrateHndlerA();
        Handler h2 = new ConcrateHndlerB();

        h1.successor = h2;   //братите внимание
        h1.handlerRequest(1);
        h1.handlerRequest(2);
        h1.handlerRequest(24);
    }
}