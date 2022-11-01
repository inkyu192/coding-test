package programmers.introduction.level0;

public class TriangleCompletionConditionTwo {

    public int solution(int[] sides) {
        int answer = 0;
        int max = Math.max(sides[0], sides[1]);
        int min = Math.min(sides[0], sides[1]);

        for (int i = max - min; i < max; i++) {
            answer++;
        }

        for (int i = max + 1; i < max + min; i++) {
            answer++;
        }

        return answer;
    }
}
