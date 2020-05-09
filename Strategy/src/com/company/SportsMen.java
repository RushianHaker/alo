package com.company;

public class SportsMen implements Road {
    @Override
    public void standUp() {
        System.out.println("6-00");
    }

    @Override
    public void eat() {
        System.out.println("milkShake");
    }

    @Override
    public void goToWork() {
        System.out.println("fast");
    }
}
