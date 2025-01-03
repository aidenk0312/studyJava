package study.BasicMathematics.Day6;

// Basic Mathematics - Exponents and Logarithms

public class ExponentsAndLogStudy {
    public static void main(String[] args) {

        // 1. Squares, Square Roots, Exponents
        System.out.println("== Squares ==");
        System.out.println(Math.pow(2, 3));
        System.out.println(Math.pow(2, -3));
        System.out.println(Math.pow(-2, -3));

        System.out.println(Math.pow(2, 30));
        System.out.printf("%.0f\n", Math.pow(2, 30));

        System.out.println("== Square Roots ==");
        System.out.println(Math.sqrt(16));
        System.out.println(Math.pow(16, 1.0/2));

        // Note: Absolute Value
        System.out.println("== Absolute Value ==");
        System.out.println(Math.abs(5));
        System.out.println(Math.abs(-5));

        // 2. Logarithms
        System.out.println("== Logarithms ==");
        System.out.println(Math.E);
        System.out.println(Math.log(2.718281828459045));
        System.out.println(Math.log10(1000));

        System.out.println(Math.log(4) / Math.log(2));
    }
}