package programmers.lv2;

import java.util.PriorityQueue;

public class MoreSpicy {

    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int i : scoville) {
            queue.add(i);
        }

        while (queue.size() > 1 && queue.peek() < K) {
            Integer a = queue.poll();
            Integer b = queue.poll();
            queue.add(a + (b * 2));
            answer++;
        }

        if (queue.size() <= 1 && queue.peek() < K) answer = -1;

        return answer;
    }
}
