package programmers.level_0.basictraining.list;

public class AddUntilGreaterThanN {

    public int solution(int[] numbers, int n) {
        int answer = 0;

        for (int number : numbers) {
            answer += number;

            if (answer > n) break;
        }

        return answer;
    }
}
