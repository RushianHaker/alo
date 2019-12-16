package com.company;

import org.w3c.dom.ls.LSOutput;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException, MyArrayExerption, MyLastExeption {
        Scanner scan = new Scanner(System.in);

        int i = scan.nextInt();
        String[] arr = {"de", "rg", "ko", "hu"};

        try {
            MyCheckArr(arr,i);
        } catch (MyArrayExerption e) {
            System.out.println("You are idiot, arr  = 3 items, NOT MORE!");
            return;
        }
    }

    public static void MyCheckArr(String arr[], int i) throws MyArrayExerption {
        //System.out.println(arr[8]);

        if (i > arr.length){
            throw new MyArrayExerption("Hello!");
        }else{
            System.out.println(arr[i]);
        }
    }
}
