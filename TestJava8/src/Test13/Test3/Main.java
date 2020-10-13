package Test13.Test3;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static List<Integer> list = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите колличество чисел: ");
        int valueIndx = scan.nextInt();

        System.out.println();

        for (int i = 0; i < valueIndx; i++) {
            System.out.print((i + 1) + "> ");
            int value = scan.nextInt();
            list.add(value);
        }

        Optional<Integer> value1 = getMinimym();
        System.out.println(value1);
    }

    public static Optional<Integer> getMinimym() {
        return list.stream().min((v1,v2)->v1.compareTo(v2));
    }
}
