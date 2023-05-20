package programmers.level_0.introduction;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("공 던지기")
class ThrowBallTest {

    ThrowBall test = new ThrowBall();

    @Test
    void case1() {
        int[] numbers = {1, 2, 3, 4};
        int k = 2;

        int result = 3;

        assertThat(test.solution(numbers, k)).isEqualTo(result);
    }

    @Test
    void case2() {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        int k = 5;

        int result = 3;

        assertThat(test.solution(numbers, k)).isEqualTo(result);
    }

    @Test
    void case3() {
        int[] numbers = {1, 2, 3};
        int k = 3;

        int result = 2;

        assertThat(test.solution(numbers, k)).isEqualTo(result);
    }
}