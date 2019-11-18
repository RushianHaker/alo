package com.company;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        First firstFirst = new First(20000);
        Second secondFirst = new Second(30000);
        First firstSecond = new First(10000);
        Second secondSecond = new Second(50000);

        ArrayList<BaseClass> list = new ArrayList<>();

        list.add(firstFirst);
        list.add(secondFirst);
        list.add(firstSecond);
        list.add(secondSecond);

        System.out.println("Before: ");

        for (BaseClass baseClass : list) {
            System.out.println(baseClass.getSalary());
        }

        System.out.println();

        list.sort(new Comparator<BaseClass>() {
            @Override
            public int compare(BaseClass o1, BaseClass o2) {
                return o1.getSalary().compareTo(o2.getSalary());
            }
        });

        System.out.println();

        System.out.println("After: ");
        for (BaseClass baseClass : list) {
            System.out.println(baseClass.getSalary());
        }
    }
}