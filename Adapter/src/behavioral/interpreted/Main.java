package behavioral.interpreted;

/**
      Паттерн - позволяет формировать объектно-ориентированное представление грамматики для заданного языка,
      а также описывает правила создания механизма интерпритации предложений этого языка.


     Для заданного автоматного языка определяет (позволяет сформировать объектно-ориетированное представление
     грамматики, а также интерпритатор реализованный с помощью рекурсивной композиции
     для выращивания грамматического двера) предложения этого языка

      - Формирует объектно-ориентированное представление грамматики.
 * */

public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        context.source = "bbbbb";
        context.vocabulary = 'b';

        NonTerminaExpression nonTerminaExpression = new NonTerminaExpression();
        nonTerminaExpression.interpreter(context);
        System.out.println(context.result);
    }
}
