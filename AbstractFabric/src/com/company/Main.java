package com.company;

/*
    Абстрактная фабрика (kit - инструментарий, набор инструментов)

    Предоставляет клиенту интерфейс для создания семейств взаимосвязанных или взаимозависимых объектов- продуктов, при этом
    скрывая от клиента информацию о конкретных классах создаваемых объектов-продуктов не специфицируя их конкретных классов.

    Пораждение семейств взаимодействующих объектов/продуктов.
*/

public class Main {

    public static void main(String[] args) {

        Client client = new Client(new CoffixFactory());
        client.run();
    }
}
