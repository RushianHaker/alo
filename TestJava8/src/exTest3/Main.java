package exTest3;

public class Main {
    private static int index = 0;
    private static int[] array = new int[10];

    public static void main(String[] args) {
        System.out.println("Before: " + array.length);
        for (int i = 0; i < 15; i++) {
            add(i);
        }

        for (int i = 0; i < 15; i++) {
            System.out.println(array[i]);
        }
        System.out.println("After: " + array.length);
    }

    public static void add(int value) {
        if (index > array.length - 1) {
            int arraySize = array.length * (array.length >> 1) + 1;
            int [] temp = new int [arraySize];

            for (int i = 0; i < array.length; i++) {
                temp[i] = array[i];
            }
            temp[index++]=value;
            array = temp;
        }else {
            array[index++] = value;
        }
    }
}
