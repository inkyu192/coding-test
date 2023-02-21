package inflearn.introduction.section_6.problem_9;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 9. 뮤직비디오
 */
public class Main {

    private int count(int middle, int[] arr) {
        int count = 1;
        int sum = 0;

        for (int i : arr) {
            if (sum + i > middle) {
                count++;
                sum = i;
            } else {
                sum += i;
            }
        }

        return count;
    }

    public int solution(int n, int m, int[] arr) {
        int answer = 0;
        int left = Arrays.stream(arr).max().getAsInt();
        int right = Arrays.stream(arr).sum();

        while (left <= right) {
            int middle = (left + right) / 2;

            if (count(middle, arr) <= m) {
                answer = middle;
                right = middle - 1;
            } else {
                left = middle + 1;
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
