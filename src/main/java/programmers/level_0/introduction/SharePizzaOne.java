package programmers.level_0.introduction;

public class SharePizzaOne {

    public int solution(int n) {
        int answer = n / 7;
        int remainder = n % 7;

        if (remainder != 0) answer++;

        return answer;
    }
}
