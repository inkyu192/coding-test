package inflearn.introduction.section_8.problem_6;

import java.util.Scanner;

/**
 * 6. 순열 구하기
 */
public class Main {

    static int[] select, visit, arr;
    static int n, m;

    public void DFS(int level) {
        if (level == m) {
            for (int i : select) System.out.print(i + " ");
            System.out.println();
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (visit[i] == 0) {
                    select[level] = arr[i];
                    visit[i] = 1;
                    DFS(level + 1);
                    visit[i] = 0;
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
        visit = new int[n];
        select = new int[m];
        T.DFS(0);
    }
}
