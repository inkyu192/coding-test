package inflearn.introduction.section_6.problem_4;

import java.util.Scanner;

/**
 * 4. LRU
 */
public class Main {

    public int[] solution(int size, int n, int[] arr) {
        int[] answer = new int[size];

        for (int i = 0; i < n; i++) {
            int index = -1;

            for (int j = 0; j < size; j++) {
                if (arr[i] == answer[j]) {
                    index = j;
                    break;
                }
            }

            if (index > -1) {
                for (int j = index; j > 0; j--) {
                    answer[j] = answer[j - 1];
                }
            } else {
                for (int j = size - 1; j > 0; j--) {
                    answer[j] = answer[j - 1];
                }
            }

            answer[0] = arr[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int s = kb.nextInt();
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = kb.nextInt();
        for (int x : T.solution(s, n, arr)) System.out.print(x + " ");
    }
}
