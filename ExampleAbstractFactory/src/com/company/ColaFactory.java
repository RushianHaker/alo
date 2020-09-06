package com.company;

public class ColaFactory extends AbstractFactory {

    @Override
    public AbstractBottle createBottle() {
        return new ColaBottle();
    }

    @Override
    public AbstractWater createWater() {
        return new ColaWater();
    }

    @Override
    public AbstractCover createCover() {
        return new ColaCover();
    }
}
