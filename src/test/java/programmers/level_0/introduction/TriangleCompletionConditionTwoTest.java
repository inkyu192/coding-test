package programmers.level_0.introduction;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("삼각형의 완성조건 (2)")
class TriangleCompletionConditionTwoTest {

    TriangleCompletionConditionTwo test = new TriangleCompletionConditionTwo();

    @Test
    void case1() {
        int[] sides = {1, 2};

        int result = 1;

        assertThat(test.solution(sides)).isEqualTo(result);
    }

    @Test
    void case2() {
        int[] sides = {3, 6};

        int result = 5;

        assertThat(test.solution(sides)).isEqualTo(result);
    }

    @Test
    void case3() {
        int[] sides = {11, 7};

        int result = 13;

        assertThat(test.solution(sides)).isEqualTo(result);
    }
}