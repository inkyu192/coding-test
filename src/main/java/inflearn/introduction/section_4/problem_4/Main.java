package inflearn.introduction.section_4.problem_4;

import java.util.HashMap;
import java.util.Scanner;

/**
 * 4. 모든 아나그램 찾기
 */
public class Main {

    public int solution(String a, String b) {
        int answer = 0;
        HashMap<Character, Integer> mapA = new HashMap<>();
        HashMap<Character, Integer> mapB = new HashMap<>();

        for (char c : b.toCharArray()) {
            mapB.put(c, mapB.getOrDefault(c, 0) + 1);
        }

        for (int right = 0; right < b.length() - 1; right++) {
            mapA.put(a.charAt(right), mapA.getOrDefault(a.charAt(right), 0) + 1);
        }

        int left = 0;

        for (int right = b.length() - 1; right < a.length(); right++) {
            mapA.put(a.charAt(right), mapA.getOrDefault(a.charAt(right), 0) + 1);

            if (mapA.equals(mapB)) answer++;

            mapA.put(a.charAt(left), mapA.get(a.charAt(left)) - 1);
            if (mapA.get(a.charAt(left)) == 0) mapA.remove(a.charAt(left));
            left++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String a = kb.next();
        String b = kb.next();
        System.out.print(T.solution(a, b));
    }
}
