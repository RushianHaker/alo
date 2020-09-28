package structual.flyweight;



/*
        Паттерн - описывает правильное применение техники создания разделяемых объектов, для получения
        возмтжности эффективного использования большого числа обектов

        Огранизует разделения для эффективной поддержки большого числа объектов, на разделяемые и не разделяемые.

        -> Организует работу с разделяемыми объектами
*/


public class Main {
    public static void main(String[] args) {

        int extrinsicState = 0;

        Flyweigth flyweigth = null;
        FlyweigthFactory flyweigthFactory = new FlyweigthFactory();

        flyweigth = flyweigthFactory.getFlyweigth("1");
        flyweigth.operation(extrinsicState);

        flyweigth = flyweigthFactory.getFlyweigth("15");
        flyweigth.operation(extrinsicState);

        flyweigth = new UnsharedConcreateFlyweight();
        flyweigth.operation(extrinsicState);
    }
}
