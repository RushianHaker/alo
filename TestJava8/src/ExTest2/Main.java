package ExTest2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> list = new ArrayList();

        System.out.println("Введите 5 слов: ");

        for (int i = 0; i < 5; i++) {
            System.out.printf("%d. > ", i + 1);
            list.add(scan.nextLine());
        }

        line('-', 20);
        System.out.println(" ");

        List<String> result = doubleValues(list);

        for (String a : result) {
            System.out.print(a + " , ");
        }
    }

    public static void line(char b, int a) {
        for (int i = 0; i < a; i++) {
            System.out.print(b);
        }
    }

    public static List<String> doubleValues(List<String> list) {
        List<String> stringList = new ArrayList<>();

        stringList.addAll(list);
        stringList.addAll(list);
        stringList.sort((a, b) -> a.compareTo(b));

        return stringList;
    }
}
