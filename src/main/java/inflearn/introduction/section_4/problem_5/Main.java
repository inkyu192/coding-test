package inflearn.introduction.section_4.problem_5;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * 5. K번째 큰 수
 */
public class Main {

    public int solution(int[] arr, int n, int k) {
        int answer = -1;
        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int l = j + 1; l < n; l++) {
                    set.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }

        int index = 1;
        for (Integer value : set) {
            if (index == k) answer = value;
            index++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.println(T.solution(arr, n, k));
    }
}
