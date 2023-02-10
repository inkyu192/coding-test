package inflearn.introduction.section_2.problem_7;

import java.util.Scanner;

/**
 * 7. 점수계산
 */
public class Main {

    public int solution(int n, int[] arr) {
        int answer = 0;
        int point = 0;

        for (int i = 0; i < n; i++) {
            point = arr[i] == 1 ? point + 1 : 0;
            answer += point;
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
        System.out.print(T.solution(n, arr));
    }
}
