package com.company;

public class CoffixFactory extends AbstractFactory{

    @Override
    public AbstractBottle createBottle() {
        return new CoffixBottle();
    }

    @Override
    public AbstractCoffie createCoffie() {
        return new CofixCoffie();
    }

    @Override
    public AbstractCover createCover() {
        return new CofixCover();
    }
}
