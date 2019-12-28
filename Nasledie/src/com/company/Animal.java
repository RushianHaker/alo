package com.company;

public abstract class Animal {

    public String animal;
    public String voice;
    public int age;
    public int kg;
    public String name;

    public Animal(String name, int age, int kg, String voice, String animal) {
        this.name = name;
        this.age = age;
        this.voice = voice;
        this.kg = kg;
        this.animal = animal;
    }

    public void Voice() {
        System.out.println(animal + " говорит: " + voice);
    }

    abstract void Animal();

}
