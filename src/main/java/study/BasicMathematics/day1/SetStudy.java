package study.BasicMathematics.day1;

import java.util.Arrays;
import java.util.HashSet;

public class SetStudy {
    public static void main(String[] args) {

//      Using Sets in Java - HashSet
        System.out.println("== HashSet ==");
        HashSet set1 = new HashSet();
        set1.add(1);
        set1.add(1);
        set1.add(1);
        System.out.println("set1 = " + set1);
        set1.add(2);
        set1.add(3);
        System.out.println("set1 = " + set1);
        set1.remove(1);
        System.out.println("set1 = " + set1);
        System.out.println(set1.size());
        System.out.println(set1.contains(2));


//      2. Set Operations
        System.out.println("== Set operations ==");

//      2-1. Intersection
        HashSet a = new HashSet(Arrays.asList(1, 2, 3, 4, 5));
        HashSet b = new HashSet(Arrays.asList(2, 4, 6, 7, 8, 10));
//        a.retainAll(b);
//        System.out.println("Intersection: " + a);

//      2-2. Union
//        a.addAll(b);
//        System.out.println("Union: " + a);

//      2-3. Difference
        a.removeAll(b);
        System.out.println("Difference: " + a);
    }
}
