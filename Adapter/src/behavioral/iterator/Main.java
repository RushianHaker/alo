package behavioral.iterator;


/**
 *  Паттерн (Курсор) - представляет удобный и безопасный способ доступа к эелементам коллекции (СОСТАВНОЙ ОБЪЕКТ)
 *  при этом не расскрывает внутреннего представления этой коллекции
 *
 *  Представляет способ поледовательного доступа ко всем элементам составного объектам,
 *  не расскрывая его внутреннего предсталения.
 *
 *  - Представляет объект итератор для доступа к элементам коллекции
 *
 * */


public class Main {
    public static void main(String[] args) {
        Topic[] topics = new Topic[3];
        topics[0] = new Topic("New - 0");
        topics[1] = new Topic("New - 1");
        topics[2] = new Topic("New - 2");

        TopicList list = new TopicList(topics);

        Iterator<Topic> iterator = list.iterator();

        while (iterator.hasNext()) {
            Topic topic = iterator.next();
            System.out.println(topic.getName());
        }
    }
}
