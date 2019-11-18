package com.company;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;
import sun.rmi.runtime.NewThreadAction;

import java.util.Locale;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Store {
    public BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
    static ScanerInfo info = new ScanerInfo();
    ArrayList<Phone> list = new ArrayList<>();

    static int purchaseSum = 0;
    boolean x;
    int indx;
    boolean getterModelEquals;
    boolean getterColorEquals;
    int getterPosI;
    String getterColor;

    public void newProduct(String model) throws IOException {
        getterModelEquals = false;
        getterColorEquals = false;
        if (list.size() == 0) {
            list.add(new Phone(model, info.setColor(), info.setPrice(), info.setNumber()));
        } else {
            for (int i = 0; i < list.size(); i++) {
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
        info.SetChoise();
    }

    void printerList() throws IOException {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(" ");
            System.out.println("Модель телефона: " + list.get(i).model + "\nЦвет телефона: " + list.get(i).color + "\nКоличество телефонов на складе: " + list.get(i).number + "\nЦена одного телефона: " + list.get(i).price);
        }
        System.out.println(" ");
        info.SetChoise();
    }

    public void purchase() throws IOException {
        System.out.println(" ");
        System.out.println("Какую модель телефона вы хотите купить ?");

        String currModel = info.setModel();
        int currNumber = info.setNumber();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).model.equals(currModel) && list.get(i).number < currNumber) {
                System.out.println("Такого количества телефонов нет на складе, их всего: " + list.get(i).number);
                info.SetChoise();
            } else if (list.get(i).model.equals(currModel)) {
                x = true;
                indx = i;
                break;
            } else if (!list.get(i).model.equals(currModel)) {
                System.out.println("Такой модели нет на складе.");
                info.SetChoise();
            }
        }

        if (x) {
            list.get(indx).number -= info.getNumber();
            purchaseSum += info.getNumber() * list.get(indx).price;

            System.out.println("Спасибо за покупку,осталось телефонов" + " " + list.get(indx).number);

            if (list.get(indx).number <= 0) {
                list.remove(indx);
                System.out.println("Вы все скупили.");
                info.SetChoise();
            }
        } else {
            System.out.println("введите заново");
            purchase();
        }
        info.SetChoise();
    }

    public void saleReport() throws IOException {
        System.out.println("Общая сумма:" + " " + purchaseSum);
        info.SetChoise();
    }
}