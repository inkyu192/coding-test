package inflearn.introduction.section_6.problem_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 6. 장난꾸러기
 */
public class Main {

    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();

        int[] copy = Arrays.copyOf(arr, arr.length);

        Arrays.sort(copy);

        for (int i = 0; i < n; i++) {
            if (arr[i] != copy[i]) list.add(i + 1);
        }

        return list;
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
