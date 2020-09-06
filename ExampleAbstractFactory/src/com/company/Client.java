package com.company;

public class Client {

    private AbstractCover cover;
    private AbstractWater water;
    private AbstractBottle bottle;


    public Client(AbstractFactory factory) {
        this.bottle = factory.createBottle();
        this.cover = factory.createCover();
        this.water = factory.createWater();
    }

    public void run() {
        bottle.interact(water);
        bottle.interact(cover);
    }
}
