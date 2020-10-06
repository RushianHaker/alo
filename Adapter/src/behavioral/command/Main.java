package behavioral.command;

/**     Паттерн Command (Action, Transactional) - представляет запрос в виде обьета, позволяя клиентам конфигурировать запрос
 *      (задавать параметры для его обработки), ставить запросы в очередь, протоколировать запросы и поддерживать
 *      отмену операций.
 *
 *      -> Представляет запрос в виде объекта
 * */

public class Main {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command command = new ConcreateCommand(receiver);

        Invocker invocker = new Invocker();
        invocker.storeCommand(command);
        invocker.excuteCommand();
    }
}
