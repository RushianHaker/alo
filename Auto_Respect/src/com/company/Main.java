package com.company;

public class Main {

    static String [] names = {"Оксана", "Андрей", "Лариса", "Дина", "Евгения", "Игорь", "Елена"};
    static int [] ball = {63, 65, 61, 76, 0, 87, 0};

    static Forma forma = new Forma(names,ball);

    public static void main(String[] args) {
        forma.Respect(forma.arr,forma.arr_Ball);
    }
}