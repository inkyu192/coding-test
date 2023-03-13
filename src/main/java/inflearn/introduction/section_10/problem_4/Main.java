package inflearn.introduction.section_10.problem_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * 4. 가장 높은 탑 쌓기(LIS응용)
 */
class Brick implements Comparable<Brick> {

    public int s, h, w;

    Brick(int s, int h, int w) {
        this.s = s;
        this.h = h;
        this.w = w;
    }

    @Override
    public int compareTo(Brick o) {
        return o.s - this.s;
    }
}

public class Main {

    static int[] dy;

    public int solution(ArrayList<Brick> arr) {
        int answer = 0;
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        ArrayList<Brick> arr = new ArrayList<>();
        dy = new int[n];
        for (int i = 0; i < n; i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            int c = kb.nextInt();
            arr.add(new Brick(a, b, c));
        }
        System.out.print(T.solution(arr));
    }
}
