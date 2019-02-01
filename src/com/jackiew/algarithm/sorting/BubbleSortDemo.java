package com.jackiew.algarithm.sorting;

import java.util.Arrays;

public class BubbleSortDemo {
    public static void main(String[] args) {
        int input[] = {64, 34, 25, 12, 22, 11, 90};
//        normalBubbleSort(input);
        optimizedBubbleSort(input);
        System.out.println(Arrays.toString(input));
        //the output:[11, 12, 22, 25, 34, 64, 90]
    }

    private static void normalBubbleSort(int[] input) {
        for (int i = 0; i < input.length - 1; i++) {
            for (int j = 0; j < input.length - 1 - i; j++) {
                if (input[j] > input[j + 1]) {
                    int temp = input[j + 1];
                    input[j + 1] = input[j];
                    input[j] = temp;
                }
            }

        }
    }

    private static void optimizedBubbleSort(int[] input) {
        for (int i = 0; i < input.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < input.length - 1 - i; j++) {
                if (input[j] > input[j + 1]) {
                    int temp = input[j + 1];
                    input[j + 1] = input[j];
                    input[j] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }

        }
    }
}
