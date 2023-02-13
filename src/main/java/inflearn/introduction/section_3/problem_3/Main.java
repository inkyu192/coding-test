package inflearn.introduction.section_3.problem_3;

import java.util.Scanner;

/**
 * 3. 최대 매출
 */
public class Main {

    public int solution(int n, int k, int[] arr) {
        int answer = 0;
        int sum = 0;

        for (int i = 0; i < k; i++) {
            answer += arr[i];
            sum += arr[i];
        }

        for (int i = k; i < n; i++) {
            sum += (arr[i] - arr[i - k]);
            answer = Math.max(answer, sum);
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.print(T.solution(n, k, arr));
    }
}
