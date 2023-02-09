package inflearn.introduction.section_1.problem_4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 4. 단어 뒤집기
 */
public class Main {

    public ArrayList<String> solution(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            answer.add(new StringBuilder(str[i]).reverse().toString());
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = kb.next();
        }
        for (String x : T.solution(n, str)) {
            System.out.println(x);
        }
    }
}
