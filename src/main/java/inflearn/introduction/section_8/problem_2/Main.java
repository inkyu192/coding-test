package inflearn.introduction.section_8.problem_2;

import java.util.Scanner;

/**
 * 2. 바둑이 승차(DFS)
 */
public class Main {

    static int answer = Integer.MIN_VALUE;
    static int limit, length;

    public void DFS(int level, int sum, int[] arr) {
        if (sum > limit) return;

        if (level == length) {
            answer = Math.max(answer, sum);
        } else {
            DFS(level + 1, sum, arr);
            DFS(level + 1, sum + arr[level], arr);
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        limit = kb.nextInt();
        length = kb.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = kb.nextInt();
        }
        T.DFS(0, 0, arr);
        System.out.println(answer);
    }
}
