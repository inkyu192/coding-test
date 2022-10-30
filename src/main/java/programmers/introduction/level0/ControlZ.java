package programmers.introduction.level0;

import java.util.Stack;

public class ControlZ {

    public int solution(String s) {
        String[] array = s.split(" ");
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals("Z")) {
                if (i != 0) stack.pop();
            } else {
                stack.push(Integer.parseInt(array[i]));
            }
        }

        int answer = 0;

        for (Integer integer : stack) {
            answer += integer;
        }

        return answer;
    }
}
