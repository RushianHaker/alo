package behavioral.memento;

/**
 *    Memento Token(Хранитеть) - не нарушая инкапсуляцию фиксирует и выносит за пределы объекта хозяина,
 *    его внутреннее состояние, так чтобы позднее это вынесенное состояние можно было восстановить в исходном
 *    объекте хозяине.
 *
 *    -> Предоставляет объект для хранения состояния
 **/
public class Main {
    public static void main(String[] args) {

        Originals originals = new Originals();
        originals.setState("On");
        System.out.println(originals.getState());

        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(originals.createMomento());

        originals.setState("Off");
        System.out.println(originals.getState());

        originals.setMomento(caretaker.getMemento());
        System.out.println(originals.getState());


    }
}
