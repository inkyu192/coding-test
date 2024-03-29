package programmers.level_0.basictraining.condition;

public class ReturningDifferentValuesDependingOnOddOrEven {

    public int solution(int n) {
        int answer = 0;

        if (n % 2 == 0) {
            for (int i = 0; i <= n; i+=2) {
                answer += Math.pow(i, 2);
            }
        } else {
            for (int i = 1; i <= n; i+=2) {
                answer += i;
            }
        }

        return answer;
    }
}
