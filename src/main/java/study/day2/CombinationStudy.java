package study.day2;

// Combinatorics

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class CombinationStudy {
    public static void main(String[] args) {

        // 1. Law of Addition
        System.out.println("== Law of Addition ==");

        // Number of cases where the sum of two dice rolls is a multiple of 3 or 4
        int[] dice1 = {1, 2, 3, 4, 5, 6};
        int[] dice2 = {1, 2, 3, 4, 5, 6};

        int nA = 0;
        int nB = 0;
        int nAandB = 0;

        // Basic solution
        for (int item1 : dice1) {
            for (int item2 : dice2) {
                if ((item1 + item2) % 3 == 0) {
                    nA += 1;
                }

                if ((item1 + item2) % 4 == 0) {
                    nB += 1;
                }

                if ((item1 + item2) % 12 == 0) {
                    nAandB += 1;
                }
            }
        }
        System.out.println("result: " + (nA + nB - nAandB));

        // Using HashSet
        HashSet<ArrayList> allCase = new HashSet<>();
        for (int item1 : dice1) {
            for (int item2 : dice2) {
                if ((item1 + item2) % 3 == 0 || (item1 + item2) % 4 == 0) {
                    ArrayList list = new ArrayList(Arrays.asList(item1, item2));
                    allCase.add(list);
                }
            }
        }
        System.out.println("result: " + (allCase.size()));


        // 2. Law of Multiplication
        System.out.println("== Law of Multiplication ==");
        // Number of cases where die `a` is a multiple of 3 and die `b` is a multiple of 4
        nA = 0;
        nB = 0;

        for (int item1 : dice1) {
            if (item1 % 3 == 0) {
                nA++;
            }
        }
        for (int item1 : dice2) {
            if (item1 % 4 == 0) {
                nB++;
            }
        }
        System.out.println("result: " + (nA * nB));
    }
}