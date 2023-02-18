package inflearn.introduction.section_5.problem_1;

import java.util.Scanner;
import java.util.Stack;

/**
 * 1. 올바른 괄호
 */
public class Main {

    public String solution(String str) {
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty()) return "NO";
                stack.pop();
            }
        }

        if (!stack.isEmpty()) return "NO";

        return "YES";
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
