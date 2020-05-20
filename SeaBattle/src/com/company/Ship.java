package com.company;

import java.util.Random;
import java.util.Scanner;

public class Ship{

    char[][] map = new char[4][4];
    String a = "0";
    String b = "*";
    String sum = a + b;
    int win = 0;
    Random rnd = new Random();
    Scanner scanner = new Scanner(System.in);

    public int checkWin() {
        if (map[0][0] == '0' && map[0][1] == '0' && map[0][2] == '0' &&
                map[1][0] == '0' && map[1][1] == '0' && map[1][2] == '0' &&
                map[2][0] == '0' && map[2][1] == '0' && map[2][2] == '0' &&
                map[0][0] == '0' && map[1][0] == '0' && map[2][0] == '0' &&
                map[0][1] == '0' && map[1][1] == '0' && map[2][1] == '0' &&
                map[0][2] == '0' && map[1][2] == '0' && map[2][2] == '0' &&
                map[0][0] == '0' && map[1][1] == '0' && map[2][2] == '0' &&
                map[0][2] == '0' && map[1][1] == '0' && map[2][0] == '0') {
            win = 1;
            System.out.println("YOU WIN");
            System.exit(0);
        }
        return win;
    }


    public void generateOnMap() {
        System.out.println("///////////////////");
        System.out.println("Это игровое поле...");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                map[i][j] = sum.charAt(rnd.nextInt(sum.length()));
                System.out.print(map[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public void playerShout() {
        System.out.println("впишите расположение координаты по вертикали...");
        int x = scanner.nextInt();
        System.out.println("впишите расположение координаты по горизонтали...");
        int y = scanner.nextInt();
        System.out.println("Выстрел....");
        do {
            if (map[x][y] == '*') {
                map[x][y] = '0';
                updateMap();
                playerShout();
            } else {
                System.out.println("Ты промахнулся");
                updateMap();
                playerShout();
            }
        } while (win == 0);
    }

    public void updateMap() {
        System.out.println("///////////////////");
        System.out.println("Это игровое поле...");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(map[i][j] + "\t");
            }
            System.out.println();
        }
        checkWin();
    }
}
