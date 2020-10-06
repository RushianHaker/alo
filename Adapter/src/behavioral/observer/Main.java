package behavioral.observer;

/**
    Observer(Наблюдатель) Dependens(подчиненный), Publisher-Subscriber(Издатель-Подписчик)
    Паттерн Observer - использует связь отношения зависимости один-ко многим (один издатель ко многим подписчикам).
    При изменении состояния одного обьекта(издатель) все зависящие от него обьекты оповещаются об этом и автоматически
    обновляются.

    Определяет зависимость типа один ко многим между обьектами таким образом, что при изменении состояния
    одного обьекта все зависящие от него обьеты оповещаются об этом и автоматически обновляются.

    -> Описывает технику издатель-подписчик.

    2 модели:
    1) Проталкивание
    2) Вытягивание
 */


public class Main {
    public static void main(String[] args) {
        ConcreateSubject subject = new ConcreateSubject();

        subject.attach(new ConcrateObserver(subject));
        subject.attach(new ConcrateObserver(subject));

        subject.setState("Update News!");

        subject.notifyObserver();
    }
}
