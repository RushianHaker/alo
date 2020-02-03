package com.company;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;

class Cargo<T extends SaveHouse> {

    T cargo;

    ArrayList<T> list = new ArrayList<T>();


    public void Add(T cargo) {
        for (int i = 0; i <list.size(); i++) {
            for (int y = 0; y < list.size(); y++) {
                if (list.get(i).getClass() != cargo.getClass()) {
                    System.out.println("Проверь список, ты поместил груз в не тот контейнер \r\n");
                    return;
                }
            }
            System.out.println("Добавлен груз с сылкой -> " + list.get(i).toString() + "\r\n" );
        }
        list.add(cargo);
    }

    public int AllWeight(){
        int allWeight = 0;

        for (int i = 0; i < list.size(); i++) {
            allWeight = allWeight + list.get(i).getWeight();
        }
        return allWeight;
    }

    public void PrintWeight(){
        System.out.println("////////////////////////");
        System.out.println("Вес контейнера = " + AllWeight() + "\r\n");
        System.out.println("\r\n");
    }

    public void CheckTwoWeights(int weight1, int weight2){
        if(weight1 > weight2){
            System.out.println("Первое хранилище весит больше\r\n");
            System.out.println("------------------------------");
        }else if (weight2 > weight1){
            System.out.println("Второе хранилище весит больше\r\n");
            System.out.println("------------------------------");
        }else{
            System.out.println("Они равны по массе.\r\n");
            System.out.println("------------------------------");
        }
    }

    public void TransferCargo(Cargo cargo){
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < cargo.list.size(); j++) {
                if(list.get(i).getClass().equals(cargo.list.get(j).getClass())){
                    System.out.println("!!!Не совместимость типов!!!");
                    System.out.println("\r\n");
                    System.out.println("При переносе произошла ошибка проследуйте 2 инструкциям:");
                    System.out.println("------------------------------");
                    System.out.println("Проверьте типы контейнеров!!!!!\r\n");
                    System.out.println("------------------------------");
                    System.out.println("Перезапустите билд!\r\n");
                    return;
                }
            }

        }
                //list.addAll(cargo.list.subList(0, i));
        list.addAll(cargo.list);
        cargo.list.clear();
        System.out.println(list.toString());
    }
}