package inflearn.introduction.section_6.problem_3;

import java.util.Scanner;

/**
 * 3. 삽입정렬
 */
public class Main {
    public int[] solution(int n, int[] arr) {
        for (int i = 1; i < n; i++) {
            int temp = arr[i];
            int j;

            for (j = i - 1; j >= 0; j--) {
                if (temp < arr[j]) {
                    arr[j + 1] = arr[j];
                } else {
                    break;
                }
            }

            arr[j + 1] = temp;
        }

        return arr;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = kb.nextInt();
        for (int x : T.solution(n, arr)) System.out.print(x + " ");
    }
}
