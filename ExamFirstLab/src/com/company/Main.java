package com.company;

public class Main {

    public static void main(String[] args) {
        int sum = 0;

        int result = 0;

        int f1 = 1;
        int f2 = 0;

        while (result + f1 <= 4000000) {
            result = f1 + f2;
            f2 = result;
            f1 = result - f1;

            if (result % 2 == 0) sum += result;
            System.out.println(result);
        }
        System.out.println("Answer - " + sum);
    }
}