package inflearn.introduction.section_10.problem_3;

import java.util.Scanner;

/**
 * 3. 최대부분증가수열(LIS)
 */
public class Main {

    static int[] dy;

    public int solution(int[] arr) {
        int answer = 0;
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
        System.out.print(T.solution(arr));
    }
}
