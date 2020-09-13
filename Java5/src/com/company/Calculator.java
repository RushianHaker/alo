package com.company;

import java.util.Scanner;

public class Calculator {

    static Scanner scan = new Scanner(System.in);


    public static void main(String[] args) {

        int operand1 = getNumber();

        System.out.println("Operator - ");
        char operator = scan.next().charAt(0);

        int operand2 = getNumber();

        int result = calck(operand1, operand2, operator);
        System.out.println("Ответ: " + result);
    }

    public static int calck(int operand1, int operand2, char operator) {

        int relust = 0;
        switch (operator) {
            case '+':
                relust = operand1 + operand2;
                break;
            case '-':
                relust = operand1 - operand2;
                break;
            case '*':
                relust = operand1 * operand2;
                break;
            case '/':
                if (operand2 == 0) {
                    System.out.println("На ноль делить нельзя");
                } else {
                    relust = operand1 / operand2;
                }
                break;

            default:
                System.out.println(" Команда не распознанна, попробуйте еще раз :) ");
                break;
        }
        return relust;
    }

    public static int getNumber() {
        System.out.println("Введите число: ");

        int num = 0;
        if(scan.hasNextInt()){
            num = scan.nextInt();
        }else{
            System.out.println("Это не число! ");
            scan.next();
            num = getNumber();
        }
        return num;
    }

}