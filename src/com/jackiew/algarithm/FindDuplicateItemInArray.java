package com.jackiew.algarithm;

import java.util.Arrays;

public class FindDuplicateItemInArray {
    public static void main(String[] args) {
        int[] numbers = {2, 5, 4, 6, 1, 2, 2, 4};
        int count1 = 0;
        //first way the performance is square of n
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    count1++;
                    break;
                }

            }
        }
        System.out.println("count of find by first type:" + count1);
//second way sort then find
        Arrays.sort(numbers);
        int count = 1;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] != numbers[i - 1]) {
                count++;
            }
        }
        System.out.println("duplicate count:" + (numbers.length - count));
    }
}
