package inflearn.introduction.section_4.problem_2;

import java.util.HashMap;
import java.util.Scanner;

/**
 * 2. 아나그램
 */
public class Main {

    public String solution(String s1, String s2) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s1.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : s2.toCharArray()) {
            if (!map.containsKey(c) || map.get(c) == 0) {
                return "NO";
            } else {
                map.put(c, map.get(c) - 1);
            }
        }

        return "YES";
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String a = kb.next();
        String b = kb.next();
        System.out.print(T.solution(a, b));
    }
}
