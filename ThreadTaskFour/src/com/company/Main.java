package com.company;

import java.io.*;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicLong;

public class Main {

    static Thread thRead, thWrite;
    static File file;
    static int waitMs = 50;
    static int msg = 0;
    static String line;

    public static void main(String[] args) throws InterruptedException {

        file = new File("File.txt");

        thWrite = new Thread(() -> {
            try {
                for (int i = 0; i < 5; i++) {
                    try (FileWriter fileWriter = new FileWriter(file)) {
                        fileWriter.write(msg++ + " ");
                        System.out.println("Печать информации ------");
                    }
                    Thread.sleep(waitMs * 2);
                }
            } catch (IOException | InterruptedException e) { e.printStackTrace(); }
        });

        thRead = new Thread(() -> {
            try {
                for (int i = 0; i < 5; i++) {
                    try {
                        File file = new File("File.txt");
                        FileReader fileReader = new FileReader(file);
                        BufferedReader reader = new BufferedReader(fileReader);

                        line = reader.readLine();

                        while (line != null) {
                            System.out.println(line);

                            line = reader.readLine();
                        }

                    } catch (Exception e) { e.printStackTrace(); }
                    Thread.sleep(waitMs * 2);
                }
            } catch (InterruptedException e) { e.printStackTrace(); }
        });

        thWrite.start();
        Thread.sleep(waitMs);
        thRead.start();
    }
}