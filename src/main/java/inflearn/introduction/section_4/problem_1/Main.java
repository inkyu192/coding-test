package inflearn.introduction.section_4.problem_1;

import java.util.HashMap;
import java.util.Scanner;

/**
 * 1. 학급 회장(해쉬)
 */
public class Main {

    public char solution(int n, String s) {
        char answer = ' ';
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int max = Integer.MIN_VALUE;

        for (Character key : map.keySet()) {
            Integer value = map.get(key);

            if (value > max) {
                answer = key;
                max = value;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String str = kb.next();
        System.out.println(T.solution(n, str));
    }
}
