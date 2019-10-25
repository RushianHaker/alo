package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int j;
        int x;
        int[] arr = new int [20];



        Random(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for (int i = 1; i < arr.length; i++) {
           x = arr[i];
           j = i;
            while (j > 0 && arr[j - 1] > x){
                arr[j] = arr[j-1];
                j = j - 1;
            }
            arr[j] = x;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void Random(int[] arr){
       Random rand = new Random();
       for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
        }
    }
}
