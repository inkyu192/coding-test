package inflearn.introduction.section_8.problem_9;

import java.util.Scanner;

/**
 * 9. 조합 구하기
 */
public class Main {

    static int[] combi;
    static int n, m;

    public void DFS(int level, int s) {
        if (level == m) {
            for (int i : combi) System.out.print(i + " ");
            System.out.println();
        } else {
            for (int i = s; i <= n; i++) {
                combi[level] = i;
                DFS(level + 1, i + 1);
            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        combi = new int[m];
        T.DFS(0, 1);
    }
}
