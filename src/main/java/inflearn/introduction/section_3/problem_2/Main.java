package inflearn.introduction.section_3.problem_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 2. 공통원소 구하기
 */
public class Main {

    public ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
        ArrayList<Integer> answer = new ArrayList<>();
        int pointer1 = 0;
        int pointer2 = 0;

        Arrays.sort(a);
        Arrays.sort(b);

        while (pointer1 < n && pointer2 < m) {
            if (a[pointer1] < b[pointer2]) {
                pointer1++;
            } else if (a[pointer1] > b[pointer2]) {
                pointer2++;
            } else {
                answer.add(a[pointer1]);
                pointer1++;
                pointer2++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = kb.nextInt();
        }
        int m = kb.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = kb.nextInt();
        }
        for (int x : T.solution(n, m, a, b)) System.out.print(x + " ");
    }
}
