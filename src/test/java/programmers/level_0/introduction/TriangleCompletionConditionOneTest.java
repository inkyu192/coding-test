package programmers.level_0.introduction;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("삼각형의 완성조건 (1)")
class TriangleCompletionConditionOneTest {

    TriangleCompletionConditionOne test = new TriangleCompletionConditionOne();

    @Test
    void case1() {
        int[] sides = {1, 2, 3};

        int result = 2;

        assertThat(test.solution(sides)).isEqualTo(result);
    }

    @Test
    void case2() {
        int[] sides = {3, 6, 2};

        int result = 2;

        assertThat(test.solution(sides)).isEqualTo(result);
    }

    @Test
    void case3() {
        int[] sides = {199, 72, 222};

        int result = 1;

        assertThat(test.solution(sides)).isEqualTo(result);
    }
}