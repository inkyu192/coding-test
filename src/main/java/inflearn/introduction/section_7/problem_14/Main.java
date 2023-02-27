package inflearn.introduction.section_7.problem_14;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 14. 그래프 최단거리(BFS)
 */
public class Main {

    static int n, m = 0;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] visit, distant;

    public void BFS(int v) {
        visit[v] = 1;
        distant[v] = 0;
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(v);

        while (!queue.isEmpty()) {
            int cv = queue.poll();

            for (int nv : graph.get(cv)) {
                if (visit[nv] == 0) {
                    visit[nv] = 1;
                    queue.offer(nv);
                    distant[nv] = distant[cv] + 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        graph = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Integer>());
        }
        visit = new int[n + 1];
        distant = new int[n + 1];
        for (int i = 0; i < m; i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            graph.get(a).add(b);
        }
        T.BFS(1);
        for (int i = 2; i <= n; i++) {
            System.out.println(i + " : " + distant[i]);
        }
    }
}
