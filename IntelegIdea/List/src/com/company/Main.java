package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        List list = new List();
        list.Add(5);
        list.Add(1);
        list.Add(0);
        list.Add(0);
        list.Add(2);
        list.Add(2);
        list.Add(7);

        list.Print();
        list.Count();

        list.Remove();

//        list.Add(5);
//        list.Add(1);
//        list.Add(0);
//        list.Add(0);
//        list.Add(2);
//        list.Add(2);
        //list.Add(7);

        list.Print();
        list.Count();
    }
}
