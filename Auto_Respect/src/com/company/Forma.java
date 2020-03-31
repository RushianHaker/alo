package com.company;

public class Forma {

    String[] arr;
    int[] arr_Ball;

    public Forma(String[] arr, int[] arr_Ball) {
        this.arr = arr;
        this.arr_Ball = arr_Ball;
    }


    public void Respect(String[] arr, int[] arr_Ball) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("" + arr[i] + ", добрый день.\n" +
                    "\n" +
                    "Меня зовут Максим - преподаватель студии ФОКС.\n" +
                    "\n" +
                    "Ниже привожу отзыв о работе Вашего ребенка на занятиях.\n" +
                    "\n" +
                    "Ребенок очень увлечен, достаточно хорошо работает на занятиях, изредка выполняет домашнюю работу.\n" +
                    "Набралл " + arr_Ball[i] + " балл на экзамене.\n" +
                    "\n" +
                    arr[i] + ", если не сложно, то прошу Вас написать отзыв о нашей работе =)\n");
        }
    }
}

