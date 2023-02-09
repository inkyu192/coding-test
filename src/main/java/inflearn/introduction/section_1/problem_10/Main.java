package inflearn.introduction.section_1.problem_10;

import java.util.Scanner;

/**
 * 10. 가장 짧은 문자거리
 */
public class Main {

    public int[] solution(String s, char t) {
        int[] answer = new int[s.length()];
        int num = 100;

        for (int i = 0; i < s.length(); i++) {
            num = s.charAt(i) == t ? 0 : num + 1;
            answer[i] = num;
        }

        num = 100;

        for (int i = s.length() - 1; i >= 0; i--) {
            num = s.charAt(i) == t ? 0 : num + 1;
            answer[i] = Math.min(answer[i], num);
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);
        for (int x : T.solution(str, c)) {
            System.out.print(x + " ");
        }
    }
}
