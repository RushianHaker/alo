package com.company;

public class Sidan extends Car{
    public Sidan(int age, int speed, String model, String color, int number) {
        super(age, speed, model, color, number);
    }


   /* public void Cat(int age, String name) {
        super.Animal(age, name);
    }

    @Override
    void Voise(String name) {
        System.out.println("Мяу-Мяу   " + name);
    }

    @Override
    void walk() {
        System.out.println("Ходит очень аккуратно и тихо");
    }

    @Override
    public String toString() {
        return "age -  " + age;
    }*/

    @Override
    public void InfoFromNavigator() {
        System.out.println(model +" поехала " +  toString());
    }

    @Override
    public String toString() { return "Машина: " + model + " -> едет со скоростью - " + speed; }
}
