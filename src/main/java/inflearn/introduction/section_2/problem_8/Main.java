package inflearn.introduction.section_2.problem_8;

import java.util.Scanner;

/**
 * 8. 등수구하기
 */
public class Main {

    public int[] solution(int n, int[] arr) {
        int[] answer = new int[n];

        for (int i = 0; i < n; i++) {
            int rank = 1;

            for (int j = 0; j < n; j++) {
                if (arr[i] < arr[j]) rank++;
            }

            answer[i] = rank;
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        for (int x : T.solution(n, arr)) System.out.print(x + " ");
    }
}
