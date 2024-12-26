package study.Day4;

// Practice
// Generate all three-digit natural numbers using 1, 2, 3, and 4 (Order doesn't matter, no repetition)

public class CombinationPractice {
    void combination(int[] arr, boolean[] visited, int depth, int n, int r) {

        if (r == 0) {
            for (int i = 0; i < n; i++) {
                if (visited[i]) {
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println();
            return;
        }
        if (depth == n) {
            return;
        }

        visited[depth] = true;
        combination(arr, visited, depth + 1, n, r - 1);

        visited[depth] = false;
        combination(arr, visited, depth + 1, n, r);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        boolean[] visited = {false, false, false, false};

        CombinationPractice p = new CombinationPractice();
        p.combination(arr, visited, 0, 4, 3);
    }
}