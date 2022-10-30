package programmers.introduction.level0;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("공 던지기")
class ThrowBallTest {

    ThrowBall throwBall = new ThrowBall();

    @Test
    void testCase1() {
        int[] numbers = {1, 2, 3, 4};
        int k = 2;

        int expected = 3;

        assertThat(throwBall.solution(numbers, k)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        int k = 5;

        int expected = 3;

        assertThat(throwBall.solution(numbers, k)).isEqualTo(expected);
    }

    @Test
    void testCase3() {
        int[] numbers = {1, 2, 3};
        int k = 3;

        int expected = 2;

        assertThat(throwBall.solution(numbers, k)).isEqualTo(expected);
    }
}