package inflearn.introduction.section_2.problem_3;

import java.util.Scanner;

/**
 * 3. 가위바위보
 */
public class Main {

    public String solution(int n, int[] a, int[] b) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            if (a[i] == b[i]) sb.append("D");
            else if (a[i] == 1 && b[i] == 3) sb.append("A");
            else if (a[i] == 2 && b[i] == 1) sb.append("A");
            else if (a[i] == 3 && b[i] == 2) sb.append("A");
            else sb.append("B");
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = kb.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = kb.nextInt();
        }
        for (char x : T.solution(n, a, b).toCharArray()) System.out.println(x);
    }
}
