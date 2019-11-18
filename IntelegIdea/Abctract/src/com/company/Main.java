package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        ArrayList<BaseClass> list = new ArrayList<BaseClass>();

        list.add(new First(65000));
        list.add(new First(30000));
        list.add(new First(90000));
        list.add(new Second(20000));

        System.out.println("Before: ");
        for(BaseClass first : list){
            System.out.print(first.getSalary() + " ");
        }

        Collections.sort(list, new Comparator<BaseClass>() {
            @Override
            public int compare(BaseClass o1, BaseClass o2) {
                return o1.getSalary().compareTo(o2.getSalary());
            }
        });

        System.out.println("After: ");
        for(BaseClass first : list){
            System.out.print(first.getSalary()+" ");
        }
    }
}
