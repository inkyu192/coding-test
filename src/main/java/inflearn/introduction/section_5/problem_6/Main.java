package inflearn.introduction.section_5.problem_6;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 6. 공주구하기
 */
public class Main {

    public int solution(int n, int k) {
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }

        while (queue.size() != 1) {
            for (int i = 0; i < k - 1; i++) {
                queue.offer(queue.poll());
            }

            queue.poll();
        }

        return queue.poll();
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        System.out.println(T.solution(n, k));
    }
}
