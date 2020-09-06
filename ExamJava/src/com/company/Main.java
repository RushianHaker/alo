package com.company;

public class Main extends Thread{
        private int a;

        public Main(){
            a = 2;
            start();
            System.out.println(a);
        }

        public void run(){
            a++;
        }

    public static void main(String[] args) {
new Main();
    }
}
