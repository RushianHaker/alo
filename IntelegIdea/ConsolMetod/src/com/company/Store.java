package com.company;

import java.io.IOException;
import java.util.ArrayList;


public class Store {
    static ScannerInfo info = new ScannerInfo();
    static Main main = new Main();
    ArrayList<Phone> list = new ArrayList<>();

    static int purchaseSum = 0;
    boolean x;
    int indx;
    boolean getterModelEquals;
    boolean getterColorEquals;
    int getterPosI;
    String getterColor;
    boolean smth;
    boolean smthColor;

    /*void remove() {
        list.add(new Phone("a", "red", 2900, 5));
        list.add(new Phone("b", "black", 5500, 9));
        list.add(new Phone("c", "yellow", 30000, 13));
    }*/

    public void newProduct(String model) throws IOException {
        getterModelEquals = false;
        getterColorEquals = false;
        if (list.size() == 0) {
            list.add(new Phone(model, info.setColor(), info.setPrice(), info.setNumber()));

        } else {
            for (int i = 0; i < list.size(); i++) {
                //добавить здесь звапись в лист
                if (list.get(i).model.equals(model)) {
                    getterModelEquals = true;
                    getterPosI = i;
                    if (list.get(i).color.equals(info.setColor())) {
                        getterColor = list.get(i).color;
                        getterColorEquals = true;
                    } else {
                        getterColor = info.getColor();
                        getterColorEquals = false;
                    }
                }
            }
            if (getterModelEquals) {
                if (getterColorEquals) {
                    list.get(getterPosI).addNumber(info.setNumber());
                } else {
                    list.add(new Phone(model, getterColor, info.setPrice(), info.setNumber()));
                }
            } else {
                list.add(new Phone(model, info.setColor(), info.setPrice(), info.setNumber()));
            }
        }
        System.out.println("Информация....");
        printerList();
        System.out.println(" ");
        main.SetChoice();
        //main.SetChoice("Список телефонов был обновлен моделью - " + model);
    }

    void printerList() throws IOException {
        for (int i = 0; i < list.size(); i++) {
            //добавить здесь звапись в лист
            System.out.println(" ");
            System.out.println("Модель телефона: " + list.get(i).model + "\nЦвет телефона: " + list.get(i).color + "\nКоличество телефонов на складе: " + list.get(i).number + "\nЦена одного телефона: " + list.get(i).price);
        }
        System.out.println(" ");
        //main.SetChoice("Был выведен список общих данных..." + "\r\n");
        main.SetChoice();
    }


    public void purchase(String model) throws IOException {

        String currModel = model;
        x = false;
        smth = false;
        smthColor = false;

        for (int i = 0; i < list.size(); i++) {
            //добавить здесь звапись в лист
            if (list.get(i).model.equals(currModel)) {
                String currColor = info.setColor();
                if (list.get(i).color.equals(currColor)) {
                    int currNumber = info.setNumber();
                    if (list.get(i).number >= currNumber) {
                        x = true;
                        indx = i;
                        smth = false;
                        break;
                    }
                } else {
                    smthColor = true;
                }
            } else {
                smth = true;
            }
        }
        if (smth) {
            System.out.println("Такой модели нет на складе.");
        }
        if (smthColor) {
            System.out.println("Такого цвета нет на складе.");
        }
        if (x) {
            //добавить здесь звапись в лист
            list.get(indx).number -= info.getNumber();
            purchaseSum += info.getNumber() * list.get(indx).price;
            System.out.println("Спасибо за покупку,осталось телефонов" + " " + list.get(indx).number);
            if (list.get(indx).number <= 0) {
                list.remove(indx);
                System.out.println("Вы все скупили.");
                //main.SetChoice("Товар данной модели был полностью скуплен - " + model +  "\r\n");
                main.SetChoice();
            }
        } else {
            System.out.println("введите заново");
            purchase(info.setModel());
        }
        //main.SetChoice("Был куплен телефон модели - " + model + "\r\n");
        //main.SetChoice(model);
        main.SetChoice();
    }

    public void saleReport() throws IOException {
        System.out.println("Общая сумма:" + " " + purchaseSum);
        //main.SetChoice("Был выведен общий итог продаж - " + purchaseSum + "\r\n");
        main.SetChoice();
    }

    /*public void BreakAll() throws IOException {
        boolean i = true;
        while (!i) {
            System.out.println("///*--Магазин был закрыт--/// ");
            break;
        }*/
}