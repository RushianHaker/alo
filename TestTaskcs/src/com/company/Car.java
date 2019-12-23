package com.company;

public class Car {

   /* public int age;
    public static String name;


    public void Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void Idel() {
        System.out.println("Дышит");
    }

    abstract void Voise(String name);

    abstract void walk();

    @Override
    public String toString() {
        return " " + age;
    }*/

    int age;
    String model;
    int speed;
    String color;
    int number;


    public Car(int age, int speed, String model, String color, int number) {
        this.model = model;
        this.age = age;
        this.speed = speed;
        this.color = color;
        this.number = number;
    }

    public void InfoFromNavigator() {
        System.out.println(model + " затормозила " + toString());
    }

    @Override
    public String toString() {     //это доп метод, который просто преобразует int в String (он нужен для удобного вывода в консоль)
        return " Ваша скорость:" + speed +
                "\n Модель машины: " + model +
                    "\n Цвет машины " + color +
                        "\n Номера машины - " + number;
    }
}
