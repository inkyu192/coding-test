package programmers.level_0.basictraining.loop;

public class CountUp {

    public int[] solution(int start, int end) {
        int[] answer = new int[end - start + 1];
        int index = 0;

        for (int i = start; i <= end; i++) {
            answer[index] = i;
            index++;
        }

        return answer;
    }
}
