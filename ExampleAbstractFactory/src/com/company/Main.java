package com.company;

public class Main {

    public static void main(String[] args) {
        Client clientCola = new Client(new ColaFactory());
        Client clientSprite = new Client(new SpriteFactory());

        clientCola.run();
        System.out.println(" /////////////// ");
        clientSprite.run();
    }
}
