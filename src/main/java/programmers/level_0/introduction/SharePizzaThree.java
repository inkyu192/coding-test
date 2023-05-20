package programmers.level_0.introduction;

public class SharePizzaThree {

    public int solution(int slice, int n) {
        int answer = n / slice;
        int remainder = n % slice;

        if (remainder != 0) answer++;

        return answer;
    }
}
