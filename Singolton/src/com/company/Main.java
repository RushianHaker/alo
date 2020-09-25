package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello my friend/ How are?" + "I'm fune" + ", but can't know, how to make a site" + " on Php with Python!" + "\n");

        Singolton singolton = new Singolton("Foo");

        System.out.println(singolton.value);
    }
}
