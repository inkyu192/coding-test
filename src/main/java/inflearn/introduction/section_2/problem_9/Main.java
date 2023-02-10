package inflearn.introduction.section_2.problem_9;

import java.util.Scanner;

/**
 * 9. 격자판 최대합
 */
public class Main {

    public int solution(int n, int[][] arr) {
        int answer = 0;
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < n; i++) {
            int sum3 = 0;
            int sum4 = 0;

            for (int j = 0; j < n; j++) {
                sum3 += arr[i][j];
                sum4 += arr[j][i];
            }

            sum1 += arr[i][i];
            sum2 += arr[n - i - 1][n - i - 1];

            answer = Math.max(answer, sum3);
            answer = Math.max(answer, sum4);
        }
        answer = Math.max(answer, sum1);
        answer = Math.max(answer, sum2);

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = kb.nextInt();
            }
        }
        System.out.print(T.solution(n, arr));
    }
}
