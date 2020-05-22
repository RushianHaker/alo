package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ship {

    char[][] map = new char[4][4];
    char[][] exampleList = {{'0', '0', '0', '0'}, {'0', '0', '0', '0'}, {'0', '0', '0', '0'}, {'0', '0', '0', '0'}};

    String a = "0";
    String b = "*";
    String sum = a + b;
    boolean gameContinues = true;

    Random rnd = new Random();
    Scanner scanner = new Scanner(System.in);

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
                System.out.println("Корабль потоплен!");
                updateMap();
                playerShout();
            } else {
                System.out.println("Ты промахнулся");
                updateMap();
                playerShout();
            }
        } while (gameContinues);
    }

    public void updateMap() {
        System.out.println(" ");
        System.out.println("///////////////////");
        System.out.println("Поле битвы...");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(map[i][j] + "\t");
            }
            System.out.println();
        }
        checkWin();
    }


    public boolean checkWin() {
        if (Arrays.deepEquals(map, exampleList)) {
            gameContinues = false;
            System.out.println("Поздравляем, ты потапил все коробли");
            System.out.println("YOU WIN");
            System.exit(0);
        }
        return gameContinues;
    }
}

/*
старое условие метода checkWin()

///////////////////////////////
if (map[0][0] == '0' && map[0][1] == '0' && map[0][2] == '0' &&
                map[1][0] == '0' && map[1][1] == '0' && map[1][2] == '0' &&
                map[2][0] == '0' && map[2][1] == '0' && map[2][2] == '0' &&
                map[0][0] == '0' && map[1][0] == '0' && map[2][0] == '0' &&
                map[0][1] == '0' && map[1][1] == '0' && map[2][1] == '0' &&
                map[0][2] == '0' && map[1][2] == '0' && map[2][2] == '0' &&
                map[0][0] == '0' && map[1][1] == '0' && map[2][2] == '0' &&
                map[0][2] == '0' && map[1][1] == '0' && map[2][0] == '0'){

                win = 1;
                System.out.println("YOU WIN");
                System.exit(0);

                }
///////////////////////////////
 */