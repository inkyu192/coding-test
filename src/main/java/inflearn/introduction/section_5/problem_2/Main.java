package inflearn.introduction.section_5.problem_2;

import java.util.Scanner;
import java.util.Stack;

/**
 * 2. 괄호문자제거
 */
public class Main {
    public String solution(String str) {
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            if (c == ')') {
                while (stack.pop() != '(');
            } else {
                stack.push(c);
            }
        }

        StringBuilder answer = new StringBuilder();

        for (Character c : stack) {
            answer.append(c);
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
