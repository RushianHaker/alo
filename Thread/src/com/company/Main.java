package com.company;

public class Main {

    static volatile String currentWord = "first";
    static MyThread thread1;
    static Main main = new Main();

    public static void main(String[] args) throws InterruptedException {

        thread1 = new MyThread();

        Thread t1 = new Thread(() -> {
            printToString(main,"first","second");
        });
        Thread t2 = new Thread(() -> {
            printToString(main,"second","third");
        });
        Thread t3 = new Thread(() -> {
            printToString(main,"third","four");
        });
        Thread t4 = new Thread(() -> {
            printToString(main,"four","first");
        });

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        t1.join();
        t2.join();
        t3.join();
        t4.join();
    }

                                                                        
    public static void printToString(Object main, String letter1, String letter2) {
        synchronized (main) {
            try {
                for (int i = 0; i < 3; i++) {
                    while (currentWord != letter1) {
                        main.wait();
                    }
                    System.out.print(currentWord + " ");
                    currentWord = letter2;
                    main.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
