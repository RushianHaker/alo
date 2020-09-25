package com.company;

public class Main {
    public static void main(String[] args) {
        System.out.println("Wats your name? " + " and " + ", how old are you ?");

        Singolton sing = Singolton.getInstance();

        System.out.println(sing.a);
    }
}
