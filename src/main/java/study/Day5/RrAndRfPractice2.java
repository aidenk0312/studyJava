package study.Day5;

// Practice2
// Implement the greatest common divisor (GCD) using a recursive function

public class RrAndRfPractice2 {

    static int gcd(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
    System.out.println(gcd(3, 5)); // 1
    System.out.println(gcd(2, 6)); // 2
    System.out.println(gcd(8, 12)); // 4
    }
}
