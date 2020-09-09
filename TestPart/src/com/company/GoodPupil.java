package com.company;

public class GoodPupil extends Pupil {
    @Override
    public void strudy() { System.out.println("Good study"); }

    @Override
    public void read() {
        System.out.println("Good read");
    }

    @Override
    public void write() {
        System.out.println("Good write");
    }

    @Override
    public void relax() {
        System.out.println("Normal relax");
    }
}
