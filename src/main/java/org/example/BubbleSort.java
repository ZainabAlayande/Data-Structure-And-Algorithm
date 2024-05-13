package org.example;

import java.util.Arrays;

public class BubbleSort {

    public static int[] bubbleSortArray(int[] array) {
        boolean thereIsMoreToSwap = true;
        while (thereIsMoreToSwap) {
            thereIsMoreToSwap = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    thereIsMoreToSwap = true;
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        System.out.println("Sorted Array == " + Arrays.toString(bubbleSortArray(new int[]{1, 2, 3, 2, 5, 6})));
    }

}
