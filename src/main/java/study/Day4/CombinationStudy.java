package study.Day4;

public class CombinationStudy {

    static int getCombination(int n, int r) {
        int pRet = 1;
        for (int i = n; i >= n - r + 1; i--) {
            pRet *= i;
        }

        int rRet = 1;
        for (int i = 1; i <= r; i++) {
            rRet *= i;
        }
        return pRet / rRet;
    }

    public static void main(String[] args) {
        // 1. Combination
        System.out.println("== Combination ==");

        int n = 4;
        int r = 2;

        int pRet = 1;
        for (int i = n; i >= n - r + 1; i--) {
            pRet *= i;
        }

        int rRet = 1;
        for (int i = 1; i <= r; i++) {
            rRet *= i;
        }
        System.out.println("Combination Result= " + pRet / rRet);


        // 2. Combination with Repetition
        System.out.println("== Combination with Repetition ==");
        n = 2;
        r = 3;

        System.out.println("CwR result= " + getCombination(n + r - 1, r));
    }
}