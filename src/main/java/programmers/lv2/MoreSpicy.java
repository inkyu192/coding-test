package programmers.lv2;

import java.util.PriorityQueue;

public class MoreSpicy {

    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int i = 0; i < scoville.length; i++) {
            queue.add(scoville[i]);
        }

        while (queue.size() > 1 && queue.peek() < K) {
            Integer FirstNotSpicy = queue.poll();
            Integer SecondNotSpicy = queue.poll();

            int newSpicy = FirstNotSpicy + (SecondNotSpicy * 2);
            queue.add(newSpicy);
            answer++;
        }

        if (queue.size() <= 1 && queue.peek() < K) answer = -1;

        return answer;
    }
}
