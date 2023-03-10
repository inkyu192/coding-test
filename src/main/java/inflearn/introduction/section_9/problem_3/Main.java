package inflearn.introduction.section_9.problem_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * 3. 결혼식
 */
class Time implements Comparable<Time> {
    public int time;
    public char state;

    Time(int time, char state) {
        this.time = time;
        this.state = state;
    }

    @Override
    public int compareTo(Time o) {
        if (this.time == o.time) return this.state - o.state;
        return this.time - o.time;
    }
}

public class Main {

    public int solution(ArrayList<Time> arr) {
        int count = 0;
        int answer = 0;

        Collections.sort(arr);

        for (Time time : arr) {
            if (time.state == 's') {
                count++;
            } else if (time.state == 'e') {
                count--;
            }

            answer = Math.max(answer, count);
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        ArrayList<Time> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int sT = kb.nextInt();
            int eT = kb.nextInt();
            arr.add(new Time(sT, 's'));
            arr.add(new Time(eT, 'e'));
        }
        System.out.println(T.solution(arr));
    }
}
