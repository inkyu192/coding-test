package programmers.practice.level1;

import java.util.Stack;

public class MakeHamburger {

    public int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (int i : ingredient) {
            stack.push(i);

            if (stack.size() >= 4) {
                if (stack.peek() == 1) {
                    StringBuilder sb = new StringBuilder();

                    for (int j = 0; j < 4; j++) {
                        sb.append(stack.pop());
                    }

                    if (sb.toString().equals("1321")) {
                        answer++;
                    } else {
                        String[] split = sb.reverse().toString().split("");

                        for (String str : split) {
                            stack.push(Integer.parseInt(str));
                        }
                    }
                }
            }
        }

        return answer;
    }
}
