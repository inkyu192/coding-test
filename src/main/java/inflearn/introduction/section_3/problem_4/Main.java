package inflearn.introduction.section_3.problem_4;

import java.util.Scanner;

/**
 * 4. 연속 부분수열
 */
public class Main {

    public int solution(int n, int m, int[] arr) {
        int answer = 0;
        int sum = 0;
        int left = 0;

        for (int right = 0; right < n; right++) {
            sum += arr[right];
            if (sum == m) answer++;

            while (sum > m) {
                sum -= arr[left];
                left++;
                if (sum == m) answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.print(T.solution(n, m, arr));
    }
}
