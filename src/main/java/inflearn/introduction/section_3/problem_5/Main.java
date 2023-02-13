package inflearn.introduction.section_3.problem_5;

import java.util.Scanner;

/**
 * 5. 연속된 자연수의 합
 */
public class Main {

    public int solution(int n) {
        int answer = 0;
        int sum = 0;
        int left = 1;

        for (int right = 1; right <= n / 2 + 1; right++) {
            sum += right;
            if (sum == n) answer++;

            while (sum > n) {
                sum -= left;
                left++;
                if (sum == n) answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        System.out.print(T.solution(n));
    }
}
