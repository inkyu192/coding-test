package programmers.introduction.level0;

import java.util.Arrays;

public class TriangleCompletionConditionOne {

    public int solution(int[] sides) {
        Arrays.sort(sides);

        return sides[0] + sides[1] > sides[2] ? 1 : 2;
    }
}
