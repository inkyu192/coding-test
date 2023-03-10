package inflearn.introduction.section_9.problem_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * 4. 최대 수입 스케쥴
 */
class Lecture implements Comparable<Lecture> {
    public int money;
    public int day;

    Lecture(int money, int day) {
        this.money = money;
        this.day = day;
    }

    @Override
    public int compareTo(Lecture o) {
        return o.day - this.day;
    }
}

public class Main {

    static int n, max = Integer.MIN_VALUE;

    public int solution(ArrayList<Lecture> arr) {
        int answer = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        Collections.sort(arr);

        for (int i = max; i >= 1; i--) {
            for (int j = 0; j < n; j++) {
                if (arr.get(j).day == i) queue.offer(arr.get(j).money);
            }

            if (!queue.isEmpty()) answer += queue.poll();
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        ArrayList<Lecture> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int m = kb.nextInt();
            int d = kb.nextInt();
            arr.add(new Lecture(m, d));
            if (d > max) max = d;
        }
        System.out.println(T.solution(arr));
    }
}
