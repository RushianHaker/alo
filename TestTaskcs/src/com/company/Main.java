package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {


    public static void main(String[] args) {


        /*
        Cat cat = new Cat();

        cat.Idel();
        cat.Voise("Barsik");

        cat.Cat(3,"Barsik");
            System.out.println("Данные о коте - " + cat.age + "  года" + " " + "и зовут его  " + cat.name);


        System.out.println(cat.toString());
        */


    Car car = new Car(2,0,"Taiota","red", 11243);
    Sidan sidan = new Sidan(4,110,"Sidan","black",013313);

    List<Car> cars = Arrays.asList(car,sidan);

    for(Car info: cars) {
        info.InfoFromNavigator();
        }


/*
        try {
            FileReader reader = new FileReader(new File("C:\\Users\\Omen\\Documents\\hello.txt"));
            Scanner scan = new Scanner(reader);
            while(scan.hasNextLine()){
                System.out.println(scan.nextLine());
            }
            scan.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error Reading File");
            e.printStackTrace();
        }
        */
    }
}
