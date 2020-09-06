package com.company;

public class SpriteFactory extends AbstractFactory{
    @Override
    public AbstractBottle createBottle() {
        return new SpriteBottle();
    }

    @Override
    public AbstractWater createWater() {
        return new SpriteWater();
    }

    @Override
    public AbstractCover createCover() {
        return new SpriteCover();
    }
}
