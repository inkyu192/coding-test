package inflearn.introduction.section_2.problem_4;

import java.util.Scanner;

/**
 * 4. 피보나치 수열
 */
public class Main {

    public int[] solution(int n) {
        int[] answer = new int[n];

        answer[0] = 1;
        answer[1] = 1;

        for (int i = 2; i < n; i++) {
            answer[i] = answer[i - 1] + answer[i - 2];
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        for (int x : T.solution(n)) System.out.print(x + " ");
    }
}
