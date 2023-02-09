package inflearn.introduction.section_1.problem_12;

import java.util.Scanner;

/**
 * 12. 암호
 */
public class Main {

    public String solution(int n, String s) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String str = s.substring(i * 7, (i + 1) * 7)
                    .replace("#", "1")
                    .replace("*", "0");

            answer.append((char) Integer.parseInt(str, 2));
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String str = kb.next();
        System.out.println(T.solution(n, str));
    }
}
