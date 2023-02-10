package inflearn.introduction.section_2.problem_6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 6. 뒤집은 소수
 */
public class Main {

    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int num = 0;

            while (arr[i] > 0) {
                num = num * 10 + arr[i] % 10;
                arr[i] /= 10;
            }

            if (isPrime(num)) answer.add(num);
        }

        return answer;
    }

    private boolean isPrime(int num) {
        if (num < 2) return false;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        for (int x : T.solution(n, arr)) {
            System.out.print(x + " ");
        }
    }
}
