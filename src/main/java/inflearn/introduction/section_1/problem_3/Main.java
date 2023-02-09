package inflearn.introduction.section_1.problem_3;

import java.util.Scanner;

/**
 * 3. 문장 속 단어
 */
public class Main {

    public String solution(String str) {
        String answer = "";
        int max = 0;

        for (String s : str.split(" ")) {
            if (s.length() > max) {
                answer = s;
                max = s.length();
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.print(T.solution(str));
    }
}
