package com.company;

public class Dog extends Animal {
    public Dog(String name, int age, int kg, String voice, String animal) {
        super(name, age, kg, voice, animal);
    }

    @Override
    public void Voice() {
        super.Voice();
    }

    @Override
    void Animal() {
        System.out.println(animal + "\n"
                + name + "\n"
                + kg + "\n"
                + voice + "\n"
                + age + "\n");
    }
}
