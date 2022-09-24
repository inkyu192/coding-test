package programmers.stackqueue.level2;


import java.util.Stack;

public class FunctionDevelopment {

    public int[] solution(int[] progresses, int[] speeds) {
        int temp = 0;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < progresses.length; i++) {
            int day = (100 - progresses[i]) / speeds[i];
            if ((100 - progresses[i]) % speeds[i] > 0) day++;

            if (temp < day) {
                stack.push(1);
                temp = day;
            } else {
                Integer pop = stack.pop();
                pop++;
                stack.push(pop);
            }
        }

        return stack.stream().mapToInt(Integer::intValue).toArray();
    }
}
