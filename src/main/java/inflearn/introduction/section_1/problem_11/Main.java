package inflearn.introduction.section_1.problem_11;

import java.util.Scanner;

/**
 * 11. 문자열 압축
 */
public class Main {

    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        char[] chars = (s + " ").toCharArray();
        int cnt = 1;

        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] == chars[i + 1]) {
                cnt++;
            } else {
                sb.append(chars[i]);
                if (cnt != 1) sb.append(cnt);
                cnt = 1;
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
