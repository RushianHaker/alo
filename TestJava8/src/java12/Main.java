package java12;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Switcher switcher = new Switcher();
        Lamp lamp = new Lamp();
        Tv tv = new Tv();

        switcher.addElectrisityListener(lamp);
        switcher.addElectrisityListener(tv);
        switcher.addElectrisityListener(() -> System.out.println(" \uD83D\uDE19 Danger - Fire !!! "));

        switcher.swirchOn();

        //---------------------------------------------------------------------
        System.out.println(" ");
        System.out.println("Журнал пользователей включивших Switcher ");


        List<People> list = new ArrayList<>();

        list.add(new People("Yura", 10));
        list.add(new People("Max", 27));
        list.add(new People("Yellow", 11));
        list.add(new People("Devid", 9));
        list.add(new People("Horni", 67));
        list.add(new People("Wolter", 3));
        list.add(new People("Marry", 22));


        list.forEach(System.out::println);

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Тех кто старше 10 лет -> ");

        List<People> peopleList = new ArrayList<>();

        /*
       double number = 0, ageNumber = 0;
       double result = 0;

        for (People lowerAge : list) {
            if (lowerAge.getAge() > 10) {
                list1.add(lowerAge);
                number++;
                ageNumber += lowerAge.getAge();
            }
        }

        result = ageNumber / number;

        list1.forEach(System.out::println);

        System.out.println("Ages - " + result);
        */

        list.stream()
                .filter((p) -> p.getAge() > 10)
                .forEach(System.out::println);

        System.out.println(" ");
        System.out.println("Среднее арифметическое - ");

        double result = list.stream()
                .filter(e -> e.getAge() > 10)
                .mapToInt(People::getAge)
                .average()
                .getAsDouble();

        System.out.println(result);

    }
}
