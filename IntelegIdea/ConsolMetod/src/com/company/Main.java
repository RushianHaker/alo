package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    static Store store1 = new Store();
    static ScannerInfo scannerInfo = new ScannerInfo();

    //static String msgChoice;

    public static void main(String[] args) throws IOException {
        SetChoice();
    }

    public static void SetChoice() throws IOException {

        System.out.println("                                |||-----|||\r\n");
        System.out.println("                     |||------Welcome to SHOP------|||\r\n");
        System.out.println(" -------------------------------------------------------------------------------\r\n");
        System.out.println("-|New product (1)|-|Sale Report (2)|-|Purchase (3)|-|PrinterList (4)|-|Quit (5)|-" + '\n' + "Введите запрос:");
        int method = scan.nextInt();

        switch (method) {
            case 1:
                String model = scannerInfo.setModel();
                AppendIO("Был создан телефон - " + model + "\r\n" );
                store1.newProduct(model);
                break;
            case 2:
                AppendIO("Была выведена общая информация продаж." + "\r\n");
                store1.saleReport();
                break;
            case 3:
                String purchaseModel = scannerInfo.setModel();
                AppendIO("Был куплен телефон - " + purchaseModel + "\r\n");
                store1.purchase(purchaseModel);
                break;
            case 4:
                AppendIO("Была выведена общая информация по моделям  \r\n");
                store1.printerList();
                break;
            case 5:
                AppendIO("////Магазин был закрыт////\r\n");
                System.exit(1);
                break;
        }
    }

    public static void AppendIO(String msg) {
        String file = "D:\\Git_IDea\\git\\IntelegIdea\\ConsolMetod\\Shop_Information.txt";

        try (FileWriter fileIO = new FileWriter(file, true)) {
            fileIO.append(msg);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

