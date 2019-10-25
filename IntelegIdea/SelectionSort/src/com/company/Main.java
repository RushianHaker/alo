package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int[] arr = new int [100];
        int lol;

        Random(arr);

            for (int min = 0; min < arr.length; min++) {
                lol = min;
                    for (int i = min + 1; i < arr.length; i++) {
                        if(arr[lol] > arr[i]){
                            lol = i;
                        }
                    }
                    int a = arr[min];
                    arr[min]=arr[lol];
                    arr[lol]=a;
               System.out.print(arr[min] + " ");
               System.out.println();
            }
            System.out.println();
        }

        public static void Random(int [] arr){
            Random rand = new Random();

                for (int i = 0; i < arr.length; i++) {
                arr[i] = rand.nextInt(1000000);
            }
        }
    }
