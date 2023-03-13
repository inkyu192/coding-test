package inflearn.introduction.section_10.problem_5;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 5. 동전교환(냅식알고리즘)
 */
public class Main {

    static int n, m;
    static int[] dy;

    public int solution(int[] coin) {
        return 0;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        m = kb.nextInt();
        dy = new int[m + 1];
        System.out.print(T.solution(arr));
    }
}
