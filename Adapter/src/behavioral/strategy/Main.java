package behavioral.strategy;


/**

    Strategy(Стратегия), Policy (Политика)

    Паттерн Strategy - определяет набор алгоритмов, часто схожих по роду деятельности, инкапсулирует
    каждый из имеющихся алгоритмов в отдельный класс и делает их подменяемыми. Стратегия позволяет подменять
    алгоритмы без участия клиентов которые используют эти алгоритмы.

    Определяет набор алгоритмов, скрывает каждый из них и делает их взаимозаменяемыми. Стратегия позволяет
    подменять алгоритмы независимо от клиентов которые ими пользуются.

    -> Описывает способы подмены алгоритмов

 */
public class Main {
    public static void main(String[] args) {
        Context context = null;

        context = new Context(new ConcrateStrategyA());
        context.contexInterface();

        context = new Context(new ConcrateStrategyB());
        context.contexInterface();

        context = new Context(new ConcrateStrategyC());
        context.contexInterface();
    }
}
