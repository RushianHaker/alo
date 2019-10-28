package com.company;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import sun.rmi.runtime.NewThreadAction;

import java.util.Locale;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Store {
    public BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
    ScanerInfo info = new ScanerInfo();
    static Start startcall = new Start();
    ArrayList<Phone> list = new ArrayList<>();

    static int purchaseSum = 0;
    boolean x = false;
    int indx = 0;

    public void newProduct(String model) throws IOException {
        if (list.size() == 0) {

            list.add(new Phone(model, info.setColor(), info.setPrice(), info.setNumder()));
        } else {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).model.equals(model)) {
                    System.out.println("bueno");
                    if (list.get(i).color.equals(info.setColor())) {
                        System.out.println("bueno");
                        list.get(i).number += info.setNumder();
                        break;
                    }
                } else {
                    list.add(new Phone(model, info.setColor(), info.setPrice(), info.setNumder()));
                    break;
                }
            }
        }
        System.out.println("Информация....");
        printerList();
        System.out.println(" ");
        startcall.call();
    }

    void printerList() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(" ");
            System.out.println("Модель телефона: " + list.get(i).model + "\nЦвет телефона: " + list.get(i).color + "\nКоличество телефонов на складе: " + list.get(i).number + "\nЦена одного телефона: " + list.get(i).price);
        }
        //System.out.println("Модель телефона: " + list.get(0).model + "\nЦвет телефона: " + list.get(0).color + "\nКоличество телефонов на складе: " + list.get(0).number + "\nЦена одного телефона: " + list.get(0).price);
    }

    public void purchase() throws IOException {
        System.out.println(" ");
        System.out.println("Какую модель телефона вы хотите купить ?");

        String currModel = info.setModel();
        int currNumber = info.setNumder();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).model.equals(currModel)) {
                x = true;
                indx = i;
                break;
            }
        }

        if (x) {
            //System.out.println("Цена за 1 телефон:" + " " + list.get(indx).price);

            list.get(indx).number -= info.getNumber();
            purchaseSum += info.getNumber() * list.get(indx).price;

            System.out.println("Спасибо за покупку,осталось телефонов" + " " + list.get(indx).number);
            if (list.get(indx).number <= 0) {
                list.remove(indx);
                System.out.println("Вы все скупили.");
            }
        } else {
            System.out.println("Такого телефона нет на складе,введите заново");
            purchase();
        }
        startcall.call();
    }

    public void saleReport() throws IOException {
        System.out.println("Общая сумма:" + " " + purchaseSum);
        startcall.call();
    }
}
