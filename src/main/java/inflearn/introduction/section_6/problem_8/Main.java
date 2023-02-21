package inflearn.introduction.section_6.problem_8;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 8. 이분검색
 */
public class Main {

    public int solution(int n, int m, int[] arr) {
        int answer = 0;
        int left = 0;
        int right = n - 1;

        Arrays.sort(arr);

        while (left <= right) {
            int middle = (left + right) / 2;

            if (arr[middle] == m) {
                answer = middle + 1;
                break;
            } else if (arr[middle] < m) {
                left = middle + 1;
            } else if (arr[middle] > m) {
                right = middle - 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = kb.nextInt();
        System.out.println(T.solution(n, m, arr));
    }
}
