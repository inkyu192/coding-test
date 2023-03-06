package inflearn.introduction.section_8.problem_1;

import java.util.Scanner;

/**
 * 1. 합이 같은 부분집합(DFS : 아마존 인터뷰)
 */
public class Main {

    static String answer = "NO";
    static int length, total = 0;

    public void DFS(int level, int sum, int[] arr) {
        if (answer.equals("YES")) return;
        if (sum > total - sum) return;

        if (level == length) {
            if (sum == total - sum) answer = "YES";
        } else {
            DFS(level + 1, sum, arr);
            DFS(level + 1, sum + arr[level], arr);
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        length = kb.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = kb.nextInt();
            total += arr[i];
        }
        T.DFS(0, 0, arr);
        System.out.println(answer);
    }
}
