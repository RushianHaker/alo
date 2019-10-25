package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ScanerInfo {
    public BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    String model;
    String color;
    int price;
    int number;

    public String setModel() throws IOException {
        System.out.println("Введите модель - ");
        this.model = reader.readLine();

        return model;
    }

    public String getModel() {

        return model;
    }

    public String setColor() throws IOException {
        System.out.println("Введите цвет - ");
        this.color = reader.readLine();

        return color;
    }

    public String getColor() {

        return color;
    }

    public int setPrice() throws IOException {
        System.out.println("Введите цену - ");
        String second = reader.readLine();
        this.price = Integer.parseInt(second);

        return price;
    }

    public int getPrice() {

        return price;
    }

    public int setNumder() throws IOException {
        System.out.println("Введите количество -");
        String second = reader.readLine();
        this.number = Integer.parseInt(second);

        return number;
    }

    public int getNumber() {

        return number;
    }
}

