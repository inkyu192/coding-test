package programmers.introduction.level0;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("삼각형의 완성조건 (1)")
class TriangleCompletionConditionOneTest {

    TriangleCompletionConditionOne triangleCompletionConditionOne = new TriangleCompletionConditionOne();

    @Test
    void testCase1() {
        int[] sides = {1, 2, 3};

        int expected = 2;

        assertThat(triangleCompletionConditionOne.solution(sides)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int[] sides = {3, 6, 2};

        int expected = 2;

        assertThat(triangleCompletionConditionOne.solution(sides)).isEqualTo(expected);
    }

    @Test
    void testCase3() {
        int[] sides = {199, 72, 222};

        int expected = 1;

        assertThat(triangleCompletionConditionOne.solution(sides)).isEqualTo(expected);
    }
}