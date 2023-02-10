package inflearn.introduction.section_2.problem_5;

import java.util.Scanner;

/**
 * 5. 소수(에라토스테네스 체)
 */
public class Main {

    public int solution(int n) {
        int answer = 0;
        int[] ints = new int[n + 1];

        for (int i = 2; i < ints.length; i++) {
            if (ints[i] == 0) {
                answer++;

                for (int j = i; j < ints.length; j += i) {
                    ints[j] = 1;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        System.out.println(T.solution(n));
    }
}
