package com.company;

public class MyArrayDataExrption  extends Exception{
    static int number;

    public MyArrayDataExrption(String msgD, int number){
        super(msgD);
        this.number = number;

    }
}
