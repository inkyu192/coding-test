package programmers.level_0.introduction;

public class SumOfConsecutiveNumber {

    public int[] solution(int num, int total) {
        int sum = 0;

        for (int i = 0; i < num; i++) {
            sum += i;
        }

        int diff = (total - sum) / num;

        int[] answer = new int[num];

        for (int i = 0; i < num; i++) {
            answer[i] = diff + i;
        }

        return answer;
    }
}
