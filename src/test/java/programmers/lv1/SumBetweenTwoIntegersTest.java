package programmers.lv1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("문자열 내 마음대로 정렬하기")
class SumBetweenTwoIntegersTest {

    SumBetweenTwoIntegers sumBetweenTwoIntegers = new SumBetweenTwoIntegers();

    @Test
    void testCase1() {
        int a = 3;
        int b = 5;

        long expected = 12;

        assertThat(sumBetweenTwoIntegers.solution(a, b)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int a = 3;
        int b = 3;

        long expected = 3;

        assertThat(sumBetweenTwoIntegers.solution(a, b)).isEqualTo(expected);
    }

    @Test
    void testCase3() {
        int a = 5;
        int b = 3;

        long expected = 12;

        assertThat(sumBetweenTwoIntegers.solution(a, b)).isEqualTo(expected);
    }
}