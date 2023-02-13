package inflearn.introduction.section_3.problem_6;

import java.util.Scanner;

/**
 * 6. 최대 길이 연속부분수열
 */
public class Main {

    public int solution(int n, int k, int[] arr) {
        int answer = 0;
        int cnt = 0;
        int left = 0;

        for (int right = 0; right < n; right++) {
            if (arr[right] == 0) cnt++;

            while (cnt > k) {
                if (arr[left] == 0) cnt--;
                left++;
            }

            answer = Math.max(answer, right - left + 1);
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
