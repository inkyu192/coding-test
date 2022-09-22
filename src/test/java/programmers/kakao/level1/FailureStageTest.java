package programmers.kakao.level1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("실패율")
class FailureStageTest {

    FailureRate failureRate = new FailureRate();

    @Test
    void testCase1() {
        int N = 5;
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};

        int[] expected = {3, 4, 2, 1, 5};

        assertThat(failureRate.solution(N, stages)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int N = 4;
        int[] stages = {4, 4, 4, 4, 4};

        int[] expected = {4, 1, 2, 3};

        assertThat(failureRate.solution(N, stages)).isEqualTo(expected);
    }
}