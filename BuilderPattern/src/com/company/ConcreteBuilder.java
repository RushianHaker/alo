package com.company;

/**
      Builder (Строитель) - помогает организовать пошаговое построение сложного обьекта-продукта
      так, что клиенту не требуется понимать последовательность шагов и внутренне устройство строищегося
      обьекта-продукта, при этом в результате одного и того же процесса конструирования могут получаться обьекты-продукты
      с различным представлением.

      Отделяет пошаговое конструирование сложного обьекта-продукта
      от его представление, при этом в результате одного и того же
      процесса конструирования могу получаться различные представления.

 * */

public class ConcreteBuilder extends Builder {

    Product product = new Product();

    @Override
    public void buildPartA() {
        product.add("partA");
    }

    @Override
    public void buildPartB() {
        product.add("partB");
    }

    @Override
    public void buildPartC() {
        product.add("partC");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
