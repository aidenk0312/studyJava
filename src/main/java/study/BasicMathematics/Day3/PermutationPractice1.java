package study.BasicMathematics.Day3;

// Practice1
// Generate all three-digit natural numbers using 1, 2, 3, and 4 (Order matters, no repetition)
// Method 1

public class PermutationPractice1 {
    void permutation(int[] arr, int depth, int n, int r) {

        if (depth == r) {
            for (int i = 0; i < r; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = depth; i < n; i++) {
            swap(arr, depth, i);
            permutation(arr, depth + 1, n, r);
        }
    }

    void swap(int[] arr, int depth, int idx) {
        int tmp = arr[depth];
        arr[depth] = arr[idx];
        arr[idx] = tmp;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};

        PermutationPractice1 p = new PermutationPractice1();
        p.permutation(arr, 0, 4, 3);
    }
}
