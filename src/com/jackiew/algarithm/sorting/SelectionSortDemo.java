package com.jackiew.algarithm.sorting;

import java.util.Arrays;

public class SelectionSortDemo {
    public static void main(String[] args) {
        int[] input = {64, 25, 12, 22, 11};

        for (int i = 0; i < input.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < input.length; j++) {
                if (input[minIndex] > input[j]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = input[minIndex];
                input[minIndex] = input[i];
                input[i] = temp;
            }
        }
        System.out.println(Arrays.toString(input));
//        output:[11, 12, 22, 25, 64]
    }
}
