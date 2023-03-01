package inflearn.introduction.section_8.problem_3;

import java.util.Scanner;

/**
 * 3. 최대점수 구하기
 */
public class Main {

    static int answer = Integer.MIN_VALUE;
    static int length, limit;

    public void DFS(int level, int sum, int time, int[] ps, int[] pt) {
        if (time > limit) return;

        if (level == length) {
            answer = Math.max(answer, sum);
        } else {
            DFS(level + 1, sum, time, ps, pt);
            DFS(level + 1, sum + ps[level], time + pt[level], ps, pt);
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        length = kb.nextInt();
        limit = kb.nextInt();
        int[] a = new int[length];
        int[] b = new int[length];
        for (int i = 0; i < length; i++) {
            a[i] = kb.nextInt();
            b[i] = kb.nextInt();
        }
        T.DFS(0, 0, 0, a, b);
        System.out.println(answer);
    }
}
