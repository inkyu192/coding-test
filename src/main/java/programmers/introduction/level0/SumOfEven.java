package programmers.introduction.level0;

public class SumOfEven {

    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) answer += i;
        }

        return answer;
    }
}
