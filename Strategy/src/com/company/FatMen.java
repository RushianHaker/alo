package com.company;

public class FatMen implements Road {
    @Override
    public void standUp() {
        System.out.println("12-00");
    }

    @Override
    public void eat() {
        System.out.println("sandwich");
    }

    @Override
    public void goToWork() {
        System.out.println("slowly");
    }
}
