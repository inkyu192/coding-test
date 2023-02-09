package inflearn.introduction.section_1.problem_6;

import java.util.Scanner;

/**
 * 6. 중복문자제
 */
public class Main {

    public String solution(String str) {
        String answer = "";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (i == str.indexOf(c)) answer += c;
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.print(T.solution(str));
    }
}
