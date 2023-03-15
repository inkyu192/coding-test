package inflearn.introduction.section_10.problem_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * 4. 가장 높은 탑 쌓기(LIS응용)
 */
class Brick implements Comparable<Brick> {

    public int area, height, weight;

    Brick(int area, int height, int weight) {
        this.area = area;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Brick o) {
        return o.area - this.area;
    }
}

public class Main {

    static int[] dy;

    public int solution(ArrayList<Brick> arr) {
        Collections.sort(arr);

        dy[0] = arr.get(0).height;
        int answer = dy[0];

        for (int i = 1; i < arr.size(); i++) {
            int max = 0;

            for (int j = i - 1; j >= 0; j--) {
                if (arr.get(i).weight < arr.get(j).weight) {
                    max = Math.max(max, dy[j]);
                }
            }

            dy[i] = max + arr.get(i).height;
            answer = Math.max(answer, dy[i]);
        }

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
