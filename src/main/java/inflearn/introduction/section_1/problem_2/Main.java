package inflearn.introduction.section_1.problem_2;

import java.util.Scanner;

/**
 * 2. 대소문자 변환
 */
public class Main {

    public String solution(String str) {
        StringBuilder answer = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) answer.append(Character.toLowerCase(c));
            else if (Character.isLowerCase(c)) answer.append(Character.toUpperCase(c));
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.print(T.solution(str));
    }
}
