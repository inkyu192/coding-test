package inflearn.introduction.section_5.problem_7;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 7. 교육과정설계
 */
public class Main {

    public String solution(String need, String plan) {
        Queue<Character> queue = new LinkedList<>();

        for (char c : need.toCharArray()) {
            queue.offer(c);
        }

        for (char c : plan.toCharArray()) {
            if (!queue.isEmpty() && queue.contains(c)) {
                if (c != queue.poll()) {
                    return "NO";
                }
            }
        }

        if (!queue.isEmpty()) return "NO";

        return "YES";
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String a = kb.next();
        String b = kb.next();
        System.out.println(T.solution(a, b));
    }
}
