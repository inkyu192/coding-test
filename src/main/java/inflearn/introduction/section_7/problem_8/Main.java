package inflearn.introduction.section_7.problem_8;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 8. 송아지 찾기 1(BFS)
 */
public class Main {

    public int BFS(int s, int e) {
        int[] jump = {1, -1, 5};

        int[] visit = new int[10001];
        visit[s] = 1;

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(s);

        int level = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                int poll = queue.poll();

                for (int j : jump) {
                    int next = poll + j;

                    if (next == e) return level + 1;

                    if (next >= 1 && next <= 10000 && visit[next] == 0) {
                        visit[next] = 1;
                        queue.offer(next);
                    }
                }
            }

            level++;
        }

        return 0;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int s = kb.nextInt();
        int e = kb.nextInt();
        System.out.println(T.BFS(s, e));
    }
}
