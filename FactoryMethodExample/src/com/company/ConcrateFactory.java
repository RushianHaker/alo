package com.company;

public class ConcrateFactory extends Factory {
    @Override
    public Product factoryMethod() {
        return new ConcrateProduct();
    }
}
