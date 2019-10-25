package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] arr = new int[n];

        System.out.println("-----******-----");

        Rand(arr, n);
        Merge(arr);
        PrintArr(arr,n);

        System.out.println(" ");
        System.out.println(" ");
        long mergeSort = System.nanoTime();
        System.out.println("Time:" + mergeSort);

    }

    static public int[] Merge(int[] arr) {

        int left[] = new int[arr.length / 2];
        int right[] = new int[arr.length - left.length];

        if (arr.length <= 1) return arr;

        System.arraycopy(arr, 0, left, 0, left.length);
        System.arraycopy(arr, left.length, right, 0, right.length);

        Merge(left);
        Merge(right);

        MergeSort(arr, left, right);

        return arr;
    }

    static public void MergeSort(int[] arr, int[] left, int[] right) {

        int l = 0;
        int r = 0;
        int a = 0;

        while (r < right.length && l < left.length) {
            if (right[r] < left[l]) {
                arr[a] = right[r];
                r++;
            } else {
                arr[a] = left[l];
                l++;
            }
            a++;
        }
    }

    static void Rand(int[] arr, int n) {
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(10000);
        }
    }

    static void PrintArr(int[] arr, int n) {
        int b = 0;

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
            b++;
            if (b % 16 == 0) {
                System.out.println();
            }
        }
    }
}
