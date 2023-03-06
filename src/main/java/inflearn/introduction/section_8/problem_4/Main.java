package inflearn.introduction.section_8.problem_4;

import java.util.Scanner;

/**
 * 4. 중복순열 구하기
 */
public class Main {

    static int[] pm;
    static int n, m;

    public void DFS(int level) {
        if (level == m) {
            for (int i : pm) System.out.print(i + " ");
            System.out.println();
        } else {
            for (int i = 1; i <= n; i++) {
                pm[level] = i;
                DFS(level + 1);
            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        pm = new int[m];
        T.DFS(0);
    }
}
