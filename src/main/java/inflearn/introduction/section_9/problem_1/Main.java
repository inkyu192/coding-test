package inflearn.introduction.section_9.problem_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * 1. 씨름선수
 */
class Body implements Comparable<Body> {
    public int height, weight;

    Body(int height, int weight) {
        this.height = height;
        this.weight = weight;

    }

    @Override
    public int compareTo(Body o) {
        return o.height - this.height;
    }
}

public class Main {

    public int solution(ArrayList<Body> arr, int n) {
        int count = 0;
        int max = Integer.MIN_VALUE;

        Collections.sort(arr);

        for (Body body : arr) {
            if (body.weight > max) {
                count++;
                max = body.weight;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        ArrayList<Body> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int h = kb.nextInt();
            int w = kb.nextInt();
            arr.add(new Body(h, w));
        }
        System.out.println(T.solution(arr, n));
    }
}
