package com.company;


class Base {

    public Base() { System.out.println("Wats Up BASE"); }

    static { System.out.println("Hellow Base"); }

    { System.out.println("druft Base"); }

}

public class Main extends Base{

    public Main() { System.out.println("Wats Up MAIN"); }

    static { System.out.println("Hellow Main"); }

    { System.out.println("druft Main"); }





    public static void main(String[] args) {
        Main main = new Main();
        System.out.println("----------------------------------");
        Main main2 = new Main();

        int number = 10;
        int[][] arr = new int[number][number];
        System.out.println("Массив:");
        for (int indexRow = 0; indexRow < number; indexRow++) {
            for (int indexColumn = 0; indexColumn < number; indexColumn++) {
                arr[indexColumn][indexRow] = (int) (Math.random() * 21) - 10;
                System.out.print(arr[indexColumn][indexRow] + " ");
            }
            System.out.println();
        }
        {
            System.out.println("Хочу кушать !");
        }
        int sum = 0, tmp;
        for (int indexRow = 0; indexRow < number; indexRow++) {
            tmp = 0;
            for (int indexColumn = 0; indexColumn < number; indexColumn++)
                if (arr[indexColumn][indexRow] > 0) tmp += arr[indexColumn][indexRow];
                else if (arr[indexColumn][indexRow] == 0) {
                    tmp = 0;
                    break;
                }
            sum += tmp;
        }
        System.out.print("Cуммы положительных элементов массива arr: " + sum);
    }
}
