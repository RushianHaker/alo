package com.company;

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
