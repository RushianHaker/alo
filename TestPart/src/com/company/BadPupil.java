package com.company;

public class BadPupil extends Pupil {
    @Override
    public void strudy() { System.out.println("Bad Study"); }

    @Override
    public void read() { System.out.println("Bad read"); }

    @Override
    public void write() {
        System.out.println("Bad write");
    }

    @Override
    public void relax() { System.out.println("Perfect relax"); }
}
