package inflearn.introduction.section_1.problem_8;

import java.util.Scanner;

/**
 * 8. 유효한 팰린드롬
 */
public class Main {

    public String solution(String s){
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                sb1.append(c);
                sb2.append(c);
            }
        }

        if (sb1.toString().equalsIgnoreCase(sb2.reverse().toString())) {
            return "YES";
        } else {
            return "NO";
        }
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str=kb.nextLine();
        System.out.print(T.solution(str));
    }
}
