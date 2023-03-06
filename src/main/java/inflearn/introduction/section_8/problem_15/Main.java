package inflearn.introduction.section_8.problem_15;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 15. 피자 배달 거리(삼성 SW역량평가 기출문제 : DFS활용)
 */
class Point {
    public int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {

    static int n, m, len, answer = Integer.MAX_VALUE;
    static int[] combi;
    static ArrayList<Point> hs, pz;

    public void DFS(int level, int s) {
        if (level == m) {
            int sum = 0;

            for (Point h : hs) {
                int min = Integer.MAX_VALUE;

                for (int i : combi) {
                    min = Math.min(min, Math.abs(h.x - pz.get(i).x) + Math.abs(h.y - pz.get(i).y));
                }

                sum += min;
            }
            answer = Math.min(answer, sum);
        } else {
            for (int i = s; i < len; i++) {
                combi[level] = i;
                DFS(level + 1, i + 1);
            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        pz = new ArrayList<>();
        hs = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int tmp = kb.nextInt();
                if (tmp == 1) hs.add(new Point(i, j));
                else if (tmp == 2) pz.add(new Point(i, j));
            }
        }
        len = pz.size();
        combi = new int[m];
        T.DFS(0, 0);
        System.out.println(answer);
    }
}
