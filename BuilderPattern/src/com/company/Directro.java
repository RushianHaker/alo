package com.company;

public class Directro {

    private Builder builder;

    public Directro(Builder builder) {
        this.builder = builder;
    }

    public void construct(){
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
    }
}
