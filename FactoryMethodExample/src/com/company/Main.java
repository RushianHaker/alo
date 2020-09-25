package com.company;

public class Main {

    public static void main(String[] args) {
        Factory factory = new ConcrateFactory();
        Product product = factory.factoryMethod();

        factory.anOperation();
    }
}
