package study.BasicMathematics.Day7;

// Basic Mathematics - Algorithm Complexity

public class AlgorithmComplexityStudy {
    static int fibonacci(int n) {
        if (n < 3) {
            return 1;
        }
        return fibonacci(n - 2) + fibonacci(n - 1);
    }

    static int factorial(int n) {
        if (n < 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {

        // 1. Time Complexity
        System.out.println("== Time Complexity ==");

        // O(1)
        System.out.println("== O(1) ==");
        System.out.println("hello");

        // O(logN)
        System.out.println("== O(logN) ==");
        for (int i = 1; i < 16; i *= 2) {
            System.out.println("hello");
        }

        // O(N)
        System.out.println("== O(N) ==");
        for (int i = 0; i < 2; i++) {
            System.out.println("hello");
        }

        // O(NlogN)
        System.out.println("== O(NlogN) ==");
        for (int i = 0; i < 2; i++) {
            for (int j = 1; j < 8; j *= 2) {
                System.out.println("hello");
            }
        }

        // O(N^2)
        System.out.println("== O(N^2) ==");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("hello ");
            }
            System.out.println();
        }

        // O(2^N)
        System.out.println("== O(2^N) ==");
        // Fibonacci Recursion
        // 1, 1, 2, 3, 5, 8, 13, ...
        System.out.println(fibonacci(6));


        // 2. Space Complexity
        System.out.println("== Space Complexity ==");
        // O(N)
        System.out.println("== O(N) ==");
        int n = 3;
        System.out.println(factorial(n));

        // O(1)
        System.out.println("== O(1) ==");
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        System.out.println(result);
    }
}