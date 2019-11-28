package com.company;

import java.io.IOException;

public class Main {

    static int getN;
    static int getN2;
    static int length = 4;
    static String getSum;


    public static void main(String[] args) throws IOException, MyArraySizeExeption, MyArrayDataExrption {

        String[][] arr = new String[][]{{"0", "67", "34", "9"}, {"3", "3", "9","0"}, {"45", "2", "32", "19"}, {"30", "4", "12", "25"}};

        try {
            checkSize(arr);
        } catch (MyArraySizeExeption е) {
            System.out.println("Error - CheckArraySizeException");
            return;
        }
        try {
            checkData(arr);
        } catch (MyArrayDataExrption e) {
            System.out.println("Error - CheckArrayDataException");

        }
    }

    static void checkSize(String[][] arr) throws MyArraySizeExeption, MyArrayDataExrption {

        for (int j = 0; j < arr.length; j++) {
            if (arr[j].length != 4) {
                throw new MyArraySizeExeption("Вы вышли за пределы массива");
            }
        }

        if (arr.length != 4) {
            throw new MyArraySizeExeption("Вы вышли за пределы массива");
        }else{
            System.out.println("It's OK!");
        }

    }

    static void checkData(String[][] arr) throws MyArrayDataExrption {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                getN = i;
                getN2 = j;
                if (someMethod(arr[i][j])) {
                    arr[i][j] = String.valueOf(arr[i][j]);
                    getSum += arr[i][j];
                    //System.out.println(getSum);
                } else {
                    throw new MyArrayDataExrption("String", getN + getN2);
                }
            }
        }
    }

    private static boolean someMethod(String arr) {
        try {
            Integer.valueOf(arr);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}