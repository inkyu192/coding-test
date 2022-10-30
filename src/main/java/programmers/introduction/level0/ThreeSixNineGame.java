package programmers.introduction.level0;

public class ThreeSixNineGame {

    public int solution(int order) {
        int answer = 0;

        while (order > 0) {
            int remainder = order % 10;

            if (remainder == 3 || remainder == 6 || remainder == 9) answer++;

            order /= 10;
        }

        return answer;
    }
}
