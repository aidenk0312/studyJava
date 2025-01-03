package study.BasicMathematics.Day3;

public class PermutationStudy {
    public static void main(String[] args) {

        // 1. Factorial - 5!
        System.out.println("== Factorial ==");
        int n = 5;
        int ret = 1;

        for (int i = 1; i <= n; i++) {
            ret *= i;
        }
        System.out.println("Factorial result = " + ret);

        // 2. Permutation - The number of ways to arrange 5 people in 3 rows
        System.out.println("== Permutation ==");
        n = 5;
        int r = 3;
        ret = 1;

        for (int i = n; i >= n - r + 1; i--) {
            ret *= i;
        }
        System.out.println("Permutation result = " + ret);

        // 3. Repeated Permutation - The number of ways to choose 2 numbers from 4 different numbers (with repetition allowed)
        System.out.println("== Repeated Permutation ==");
        n = 4;
        r = 2;
        ret = 1;

        for (int i = 0; i < r; i++) {
            ret *= n;
        }
        System.out.println("Repeated Permutation result = " + ret);
        System.out.println(Math.pow(n, r));

        // 4. Circular Permutation - The number of ways to seat 3 people around a circular table
        System.out.println("== Circular Permutation ==");
        n = 3;
        ret = 1;

        for (int i = 1; i < n; i++) {
            ret *= i;
        }
        System.out.println("Circular Permutation result = " + ret);
    }
}