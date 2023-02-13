package inflearn.introduction.section_3.problem_1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 1. 두 배열 합치기
 */
public class Main {

    public ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
        ArrayList<Integer> answer = new ArrayList<>();
        int pointer1 = 0;
        int pointer2 = 0;

        while (pointer1 < n && pointer2 < m) {
            if (a[pointer1] < b[pointer2]) {
                answer.add(a[pointer1]);
                pointer1++;
            } else {
                answer.add(b[pointer2]);
                pointer2++;
            }
        }

        while (pointer1 < n) {
            answer.add(a[pointer1]);
            pointer1++;
        }

        while (pointer2 < m) {
            answer.add(b[pointer2]);
            pointer2++;
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
