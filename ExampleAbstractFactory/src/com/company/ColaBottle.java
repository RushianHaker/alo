package com.company;

public class ColaBottle extends AbstractBottle {
    @Override
    public void interact(AbstractWater water) {
        System.out.println("В " + this + " наливаем жидкость " + water);
    }

    @Override
    public void interact(AbstractCover cover) {
        System.out.println("И " + this + " закрываем " + cover);
    }

    @Override
    public String toString() {
        return "ColaBottle ";
    }
}
