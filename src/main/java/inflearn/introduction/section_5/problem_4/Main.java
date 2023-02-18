package inflearn.introduction.section_5.problem_4;

import java.util.Scanner;
import java.util.Stack;

/**
 * 4. 후위식 연산
 */
public class Main {

    public int solution(String str) {
        Stack<Integer> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                stack.push(Integer.parseInt(String.valueOf(c)));
            } else {
                Integer right = stack.pop();
                Integer left = stack.pop();

                if (c == '+') {
                    stack.push(left + right);
                } else if (c == '-') {
                    stack.push(left - right);
                } else if (c == '*') {
                    stack.push(left * right);
                } else if (c == '/') {
                    stack.push(left / right);
                }
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
