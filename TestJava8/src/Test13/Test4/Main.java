package Test13.Test4;


import java.util.*;

public class Main {

    public static Map<String, String> dataBase = new HashMap<>();
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        boolean a = true;

        putDataBase();

        while (a) {
            System.out.println("1 - Найти семью по городу: ");
            System.out.println("2 - Выход");

            int value = scan.nextInt();

            if (value == 1) {
                String city = scan.nextLine();
                filter(city);
            } else {
                a = false;
            }
        }
    }


    public static void putDataBase() {
        dataBase.put("лондон", "Ивановы");
        dataBase.put("челябинск", "Соронцовы");
        dataBase.put("москва", "Ивановы");
        dataBase.put("питер", "Соколовы");
        dataBase.put("самара", "Чепушиловы");
        dataBase.put("пенза", "Рыжовы");
        dataBase.put("саратов", "Соронцовы");
    }

    public static String filter(String nameOfCity) {
        System.out.println("Введите город: ");
        System.out.print("> ");

        nameOfCity = scan.nextLine().trim().toLowerCase();

        if (!dataBase.containsKey(nameOfCity)) {
            System.out.println("Такого города нет!");
        } else {
            System.out.println(dataBase.get(nameOfCity));
        }
        return " ";
    }
}
