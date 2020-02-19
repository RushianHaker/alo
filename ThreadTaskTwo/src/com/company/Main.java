package com.company;

import java.io.*;

public class Main {

    static Main main = new Main();
    public static BufferedWriter bufferedWriter = null;

    private static String [] arr = {"яблоко","агент","адвок","атармия","абсолютный","яблоко","агент","адвок","атармия","абсолютный","яблоко","агент","адвок","атармия","абсолютный","яблоко","агент","адвок","атармия","абсолютный"};

    public static void main(String[] args) throws FileNotFoundException, InterruptedException {
        try {
            File file = new File("D:\\Git_IDea\\git\\ThreadTaskTwo\\file.txt");
            FileWriter fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Thread t1 = new Thread(() -> main.fileWriter(bufferedWriter, arr));
        Thread t2 = new Thread(() -> main.fileWriter(bufferedWriter, arr));

        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }

    public void fileWriter(BufferedWriter bufferedWriter, String [] arr) {
        try {
            for (int i = 0; i < 10; i++) {
                bufferedWriter.write(arr[i]);
                System.out.println(arr[i]);
                Thread.sleep(30);
            }
            bufferedWriter.close();
        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        }
    }
}
