package com.company;

public abstract class AbstractFactory {
    public abstract AbstractBottle createBottle();
    public abstract AbstractWater createWater();
    public abstract AbstractCover createCover();
}
