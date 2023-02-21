package inflearn.introduction.section_6.problem_10;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 10. 마구간 정하기
 */
public class Main {

    private int count(int middle, int[] arr) {
        int count = 1;
        int temp = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - temp >= middle) {
                count++;
                temp = arr[i];
            }
        }

        return count;
    }

    public int solution(int n, int c, int[] arr) {
        int answer = 0;
        int left = 1;
        int right = arr[n - 1];

        Arrays.sort(arr);

        while (left <= right) {
            int middle = (left + right) / 2;

            if (count(middle, arr) >= c) {
                answer = middle;
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int c = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = kb.nextInt();
        System.out.println(T.solution(n, c, arr));
    }
}
