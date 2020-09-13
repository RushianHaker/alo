package com.company;

import static com.company.Calculator.scan;

public class Interval {


   /* public static void main(String[] args) {
        System.out.println("--------- Введите число от 0 - 100: ---------");
        System.out.println("   ЗАХОТИТЕ ПРЕРВАТЬ ИГРУ, НАБЕРИТЕ - 666");

        int playerNumber = scan.nextInt();
        numbersLine(playerNumber);

    }*/

    public static void numbersLine(int number) {
        if (number < 15) {
            System.out.println("[0-14]");
        } else if (number <= 35) {
            System.out.println("[15-35]");
        } else if (number <= 50) {
            System.out.println("[36-50]");
        } else if (number <= 100) {
            System.out.println("[51-100]");
        } else if (number == 666) {
            System.out.println("Спасибо за игру, удачи!");
            System.exit(1);
        } else {
            System.out.println("Вы вышли за указанные рамки условия ввода!");
        }

        number = scan.nextInt();
        numbersLine(number);
    }
}
