package programmers.introduction.level0;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("삼각형의 완성조건 (2)")
class TriangleCompletionConditionTwoTest {

    TriangleCompletionConditionTwo triangleCompletionConditionTwo = new TriangleCompletionConditionTwo();

    @Test
    void testCase1() {
        int[] sides = {1, 2};

        int expected = 1;

        assertThat(triangleCompletionConditionTwo.solution(sides)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int[] sides = {3, 6};

        int expected = 5;

        assertThat(triangleCompletionConditionTwo.solution(sides)).isEqualTo(expected);
    }

    @Test
    void testCase3() {
        int[] sides = {11, 7};

        int expected = 13;

        assertThat(triangleCompletionConditionTwo.solution(sides)).isEqualTo(expected);
    }
}