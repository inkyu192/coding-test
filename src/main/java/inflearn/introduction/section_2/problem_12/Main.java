package inflearn.introduction.section_2.problem_12;

import java.util.Scanner;

/**
 * 12. 멘토링
 */
public class Main {

    public int solution(int n, int m, int[][] arr) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int cnt = 0;

                for (int k = 0; k < m; k++) {
                    int il = 0;
                    int jl = 0;

                    for (int l = 0; l < n; l++) {
                        if (arr[k][l] == i) il = l;
                        if (arr[k][l] == j) jl = l;
                    }

                    if (il < jl) cnt++;
                }

                if (m == cnt) answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = kb.nextInt();
            }
        }
        System.out.print(T.solution(n, m, arr));
    }
}
