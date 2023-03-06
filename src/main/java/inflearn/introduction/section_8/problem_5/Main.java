package inflearn.introduction.section_8.problem_5;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * 5. 동전교환
 */
public class Main {

    static int n, m, answer = Integer.MAX_VALUE;

    public void DFS(int level, int sum, Integer[] arr) {
        if (level > answer) return;
        if (sum > m) return;

        if (sum == m) {
            answer = Math.min(answer, level);
        } else {
            for (int i = 0; i < n; i++) {
                DFS(level + 1, sum + arr[i], arr);
            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) arr[i] = kb.nextInt();
        Arrays.sort(arr, Collections.reverseOrder());
        m = kb.nextInt();
        T.DFS(0, 0, arr);
        System.out.println(answer);
    }
}
