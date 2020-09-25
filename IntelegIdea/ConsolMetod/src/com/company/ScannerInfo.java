package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ScannerInfo {
    static Store store1 = new Store();
    public BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    Scanner scan = new Scanner(System.in);

    String model;
    String color;
    int price;
    int number;
    int choise;

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

    public int setNumber() throws IOException {
        System.out.println("Введите количество телефонов: ");
        String justNeed = reader.readLine();
        if (isInteger(justNeed)) {
            this.number = Integer.parseInt(justNeed);
            if (number < 1) {
                System.out.println("Количество не может быть меньше 1.");
                setNumber(); }
        } else {
            setNumber();
        }
        return number;
    }

    boolean isInteger(String string) {
        try {
            Integer.valueOf(string);
            return true;
        } catch (NumberFormatException e) {
            System.out.println("Введите число");
            return false;
        }
    }

    public int getNumber() {
        return number;
    }
}