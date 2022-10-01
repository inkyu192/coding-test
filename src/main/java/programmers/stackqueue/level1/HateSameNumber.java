package programmers.stackqueue.level1;

import java.util.Stack;

public class HateSameNumber {

    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            if (stack.size() == 0) {
                stack.add(arr[i]);
            }

            if (stack.peek() != arr[i]) {
                stack.add(arr[i]);
            }
        }

        int[] answer = new int[stack.size()];

        for (int i = 0; i < stack.size(); i++) {
            answer[i] = stack.get(i);
        }

        return answer;
    }
}
