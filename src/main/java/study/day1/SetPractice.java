package study.day1;

// Practice
// Implementing Sets Using ArrayList (Without Using Set-Related Operations)

import java.util.ArrayList;

class MySet {
    // ArrayList
    ArrayList<Integer> list;

    // Constructor 1
    MySet() {
        this.list = new ArrayList<>();
    }

    // Constructor 2
    MySet(int[] arr) {
        this.list = new ArrayList<>();

        for(int item: arr) {
            this.list.add(item);
        }
    }

    // Add Element (No Duplicates)
    public void add(int x) {
        for (int item: this.list) {
            if (item == x) {
                return;
            }
        }
        this.list.add(x);
    }

    // Intersection
    public MySet retainAll(MySet b) {
        MySet ret = new MySet();

        for (int itemA: this.list) {
            for (int itemB: b.list) {
                if (itemA == itemB) {
                    ret.add(itemA);
                }
            }
        }
        return ret;
    }


    // Union
    public MySet addAll(MySet b) {
        MySet ret = new MySet();

        for (int itemA: this.list) {
            ret.add(itemA);
        }
        for (int itemB: b.list) {
            ret.add(itemB);
        }
        return ret;
    }

    // Difference
    public MySet removeAll(MySet b) {
        MySet ret = new MySet();

        for (int itemA: this.list) {
            boolean containFlag = false;

            for (int itemB: b.list) {
                if (itemA == itemB) {
                    containFlag = true;
                    break;
                }
            }
            if (!containFlag) {
                ret.add(itemA);
            }
        }
        return ret;
    }
}

public class SetPractice {
    public static void main(String[] args) {

        MySet a = new MySet();

        a.add(1);
        a.add(1);
        a.add(1);
        System.out.println(a.list);
        a.add(2);
        a.add(3);
        System.out.println(a.list);

        a = new MySet (new int[] {1, 2, 3, 4, 5});
        MySet b = new MySet (new int[] {2, 4, 6, 8, 10});
        System.out.println("a: " + a.list);
        System.out.println("b: " + b.list);

        MySet result = a.retainAll(b);
        System.out.println("Intersection: " + result.list);

        result = a.addAll(b);
        System.out.println("Union: " + result.list);

        result = a.removeAll(b);
        System.out.println("Difference: " + result.list);
    }
}
