package programmers.codechallenge.level2;

import java.util.Stack;

public class RotateParentheses {

    public int solution(String s) {
        int answer = 0;

        for (int i = 0; i < s.length(); i++) {
            StringBuilder sb = new StringBuilder()
                    .append(s, i, s.length())
                    .append(s, 0, i);

            Stack<Character> stack = new Stack<>();

            for (int j = 0; j < sb.length(); j++) {
                char c = sb.charAt(j);

                if (stack.isEmpty()) {
                    stack.push(c);
                } else {
                    if (c == ')') {
                        if (stack.peek() == '(') {
                            stack.pop();
                        } else {
                            stack.push(c);
                        }
                    } else if (c == '}') {
                        if (stack.peek() == '{') {
                            stack.pop();
                        } else {
                            stack.push(c);
                        }
                    } else if (c == ']') {
                        if (stack.peek() == '[') {
                            stack.pop();
                        } else {
                            stack.push(c);
                        }
                    } else {
                        stack.push(c);
                    }
                }
            }

            if (stack.isEmpty()) {
                answer++;
            }
        }

        return answer;
    }
}
