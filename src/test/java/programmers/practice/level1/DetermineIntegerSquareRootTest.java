package programmers.practice.level1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("정수 제곱근 판별")
class DetermineIntegerSquareRootTest {

    DetermineIntegerSquareRoot determineIntegerSquareRoot = new DetermineIntegerSquareRoot();

    @Test
    void testCase1() {
        int n = 121;

        long expected = 144;

        assertThat(determineIntegerSquareRoot.solution(n)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int n = 3;

        long expected = -1;

        assertThat(determineIntegerSquareRoot.solution(n)).isEqualTo(expected);
    }
}