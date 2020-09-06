package com.company;

public class CoffixBottle extends AbstractBottle {
    @Override
    public void interact(AbstractCover cover) {
        System.out.println(this + "interact with: " + cover);
    }

    @Override
    public void interact(AbstractCoffie coffie) {
        System.out.println(this + "interact with: " + coffie);
    }

    @Override
    public String toString() {
        return "CoffixBottle -> ";
    }
}
