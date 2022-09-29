package programmers.codechallenge.level1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("약수의 개수와 덧셈")
class CountAndSumOfDivisorTest {

    CountAndSumOfDivisor countAndSumOfDivisor = new CountAndSumOfDivisor();

    @Test
    void testCase1() {
        int left = 13;
        int right = 17;

        int expected = 43;

        assertThat(countAndSumOfDivisor.solution(left, right)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int left = 24;
        int right = 27;

        int expected = 52;

        assertThat(countAndSumOfDivisor.solution(left, right)).isEqualTo(expected);
    }
}