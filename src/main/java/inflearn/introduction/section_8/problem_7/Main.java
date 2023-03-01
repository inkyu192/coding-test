package inflearn.introduction.section_8.problem_7;

import java.util.Scanner;

/**
 * 7. 조합수(메모이제이션)
 */
public class Main {

    int[][] temp = new int[35][35];

    public int DFS(int n, int r) {
        if (temp[n][r] > 0) return temp[n][r];

        if (n == r || r == 0) {
            return 1;
        } else {
            temp[n][r] = DFS(n - 1, r - 1) + DFS(n - 1, r);

            return temp[n][r];
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int r = kb.nextInt();
        System.out.println(T.DFS(n, r));
    }
}
