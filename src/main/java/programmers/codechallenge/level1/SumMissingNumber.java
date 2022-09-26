package programmers.codechallenge.level1;

public class SumMissingNumber {

    public int solution(int[] numbers) {
        int answer = 45;

        for (int number : numbers) {
            answer -= number;
        }

        return answer;
    }
}
