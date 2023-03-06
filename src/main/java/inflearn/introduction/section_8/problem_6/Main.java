package inflearn.introduction.section_8.problem_6;

import java.util.Scanner;

/**
 * 6. 순열 구하기
 */
public class Main {

    static int[] pm, ch, arr;
    static int n, m;

    public void DFS(int level) {
        if (level == m) {
            for (int i : pm) System.out.print(i + " ");
            System.out.println();
        } else {
            for (int i = 0; i < n; i++) {
                if (ch[i] == 0) {
                    pm[level] = arr[i];
                    ch[i] = 1;
                    DFS(level + 1);
                    ch[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = kb.nextInt();
        ch = new int[n];
        pm = new int[m];
        T.DFS(0);
    }
}
