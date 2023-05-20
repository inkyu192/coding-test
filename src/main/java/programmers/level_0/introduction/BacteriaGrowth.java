package programmers.level_0.introduction;

public class BacteriaGrowth {

    public int solution(int n, int t) {
        int answer = n;

        for (int i = 0; i < t; i++) {
            answer *= 2;
        }

        return answer;
    }
}
