package com.company;

public class Phone {

    String model;
    String color;
    int price;
    int number;
    String msg;

    public Phone(String model, String color,int price,int number){
        this.color = color;
        this.model = model;
        this.number = number;
        this.price = price;
    }

    public void addNumber (int number){
        this.number = this.number + number;
    }

    /*void removeNumber(int count){
        this.number = this.number - number;
    }*/
}
