package inflearn.introduction.section_6.problem_1;

import java.util.Scanner;

/**
 * 1. 선택정렬
 */
public class Main {

    public int[] solution(int n, int[] arr) {
        for (int i = 0; i < n; i++) {
            int index = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[index]) index = j;
            }

            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
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
