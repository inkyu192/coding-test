package inflearn.introduction.section_1.problem_9;

import java.util.Scanner;

/**
 * 9. 숫자만 추출
 */
public class Main {

    public int solution(String s){
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) sb.append(c);
        }

        return Integer.parseInt(sb.toString());
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str=kb.next();
        System.out.print(T.solution(str));
    }
}
