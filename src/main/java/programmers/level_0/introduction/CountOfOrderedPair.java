package programmers.level_0.introduction;

public class CountOfOrderedPair {

    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) answer++;
        }

        return answer;
    }
}
