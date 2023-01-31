package programmers.heap.level2;

import java.util.PriorityQueue;

public class MoreSpicy {

    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> queue = new PriorityQueue();

        for (int i : scoville) queue.add(i);

        while (queue.peek() <= K) {
            if (queue.size() == 1) return -1;

            int a = queue.poll();
            int b = queue.poll();
            int result = a + (b * 2);

            queue.add(result);
            answer++;
        }

        return answer;
    }
}
