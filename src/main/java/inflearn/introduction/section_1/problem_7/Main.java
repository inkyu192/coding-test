package inflearn.introduction.section_1.problem_7;

import java.util.Scanner;

/**
 * 7. 회문문자열
 */
public class Main {

    public String solution(String str) {
        if (str.equalsIgnoreCase(new StringBuilder(str).reverse().toString())) {
            return "YES";
        } else {
            return "NO";
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.print(T.solution(str));
    }
}
