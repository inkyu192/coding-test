package inflearn.introduction.section_9.problem_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * 2. 회의실 배정
 */
class Time implements Comparable<Time> {
    public int start, end;

    Time(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public int compareTo(Time o) {
        if (this.end == o.end) return this.start - o.start;
        return this.end - o.end;
    }
}

public class Main {

    public int solution(ArrayList<Time> arr, int n) {
        int count = 0;
        int end = 0;

        Collections.sort(arr);

        for (Time time : arr) {
            if (time.start >= end) {
                count++;
                end = time.end;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        ArrayList<Time> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = kb.nextInt();
            int y = kb.nextInt();
            arr.add(new Time(x, y));
        }
        System.out.println(T.solution(arr, n));
    }
}
