package study.BasicMathematics.day2;

// Practice
// Finding divisors, calculating the Greatest Common Divisor (GCD) and the Lowest Common Multiple (LCM)

import java.util.ArrayList;

public class CombinationPractice {
    //  Divisors
    public ArrayList getDivisor(int num) {
        ArrayList ret = new ArrayList();

        for (int i = 1; i <= (int)num / 2; i++) {
            if (num % i == 0) {
                ret.add(i);
            }
        }
        ret.add(num);

        return ret;
    }

    //  Greatest Common Divisor (GCD)
    public int getGCD(int numA, int numB) {
        int gcd = -1;

        ArrayList divisorA = this.getDivisor(numA);
        ArrayList divisorB = this.getDivisor(numB);

        for (int itemA: (ArrayList<Integer>) divisorA) {
            for (int itemB: (ArrayList<Integer>) divisorB) {
                if (itemA == itemB) {
                    if (itemA > gcd) {
                        gcd = itemA;
                    }
                }
             }
        }
        return gcd;
    }

    //  Lowest Common Multiple (LCM)
    public int getLCM(int numA, int numB) {
        int lcm = -1;

        int gcd = this.getGCD(numA, numB);

        if (gcd != -1) {
            lcm = numA * numB / gcd;
        }
        return lcm;
    }

    public static void main(String[] args) {

        int number1 = 10;
        int number2 = 6;

        CombinationPractice p = new CombinationPractice();
        ArrayList<Integer> l1 = p.getDivisor(number1);   // 10: 1, 2, 5, 10
        ArrayList<Integer> l2 = p.getDivisor(number2);   // 6: 1, 2, 3, 6
        System.out.println("l1 = " + l1);
        System.out.println("l2 = " + l2);

        System.out.println("GCD: " + p.getGCD(number1, number2));
        System.out.println("LCM: " + p.getLCM(number1, number2));
    }
}