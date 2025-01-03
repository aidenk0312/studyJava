package study.BasicMathematics.Day5;

// Recurrence Relation and Recursive Function

public class RrAndRfStudy {

    static int recursion1 (int n) {
        if (n == 1) {
            return 1;
        }
        return 3 * recursion1(n - 1);
    }

    static int recursion2 (int n) {
        if (n == 1) {
            return 1;
        }
        return n * recursion1(n - 1);
    }

    static int recursion3 (int n) {
        if (n < 3) {
            return 1;
        }
        return recursion3(n - 2) + recursion3(n - 1);
    }

    public static void main(String[] args) {

        // Recurrence Relation -> Loop, Recursive Function
        System.out.println("== Recurrence Relation/Recursive Function Practice 1 ==");
        // The n-th term of 1, 3, 9, 27, ...
        int n = 4;
        int result = 1;
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                result = 1;
            } else {
                result *= 3;
            }
        }
        System.out.println(result);


        System.out.println("== Recurrence Relation/Recursive Function Practice 2 ==");
        // The sum of the first n terms of 1, 2, 3, 4, 5, 6, ...
        n = 5;
        result = 0;
        for (int i = 1; i < n + 1; i++) {
            result += i;
        }
        System.out.println(result);


        System.out.println("== Recurrence Relation/Recursive Function Practice 3 ==");
        // The n-th term of 1, 1, 2, 3, 5, 8, 13, ...
        n = 6;
        result = 0;
        int a1 = 1;
        int a2 = 1;

        if (n < 3) {
            result = 1;
        } else {
            for (int i = 2; i < n; i++) {
                result = a1 + a2;
                a1 = a2;
                a2 = result;
            }
        }
        System.out.println(result);
    }
}
