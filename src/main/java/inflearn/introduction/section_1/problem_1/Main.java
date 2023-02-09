package inflearn.introduction.section_1.problem_1;

import java.util.Scanner;

/**
 * 1. 문자 찾기
 */
public class Main {

    public int solution(String str, char t) {
        int answer = 0;
        char c = Character.toUpperCase(t);

        for (char c1 : str.toUpperCase().toCharArray()) {
            if (c == c1) answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);
        System.out.print(T.solution(str, c));
    }
}
