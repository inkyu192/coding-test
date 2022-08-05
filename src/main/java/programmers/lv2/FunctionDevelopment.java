package programmers.lv2;

import java.util.Stack;

public class FunctionDevelopment {

    public int[] solution(int[] progresses, int[] speeds) {
        Stack<Integer> stack = new Stack<>();

        int temp = 0;
        for (int i = 0; i < progresses.length; i++) {
            int day = (100 - progresses[i]) / speeds[i];
            if ((100 - progresses[i]) % speeds[i] > 0) day++;

            if (temp < day) {
                temp = day;
                stack.push(1);
            } else {
                Integer peek = stack.peek();
                stack.pop();
                stack.push(peek + 1);
            }
        }

        return stack.stream().mapToInt(Integer::intValue).toArray();
    }
}
