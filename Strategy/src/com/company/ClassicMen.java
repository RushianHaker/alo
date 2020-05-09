package com.company;

public class ClassicMen implements Road {
    @Override
    public void standUp() {
        System.out.println("8-00");
    }

    @Override
    public void eat() {
        System.out.println("cereals + tea");
    }

    @Override
    public void goToWork() {
        System.out.println("normal");
    }
}
