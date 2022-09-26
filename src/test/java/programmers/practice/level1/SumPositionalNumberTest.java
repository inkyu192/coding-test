package programmers.practice.level1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("자릿수 더하기")
class SumPositionalNumberTest {

    SumPositionalNumber sumPositionalNumber = new SumPositionalNumber();

    @Test
    void testCase1() {
        int n = 123;

        int expected = 6;

        assertThat(sumPositionalNumber.solution(n)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int n = 987;

        int expected = 24;

        assertThat(sumPositionalNumber.solution(n)).isEqualTo(expected);
    }

    @Test
    void testCase3() {
        int n = 100000000;

        int expected = 1;

        assertThat(sumPositionalNumber.solution(n)).isEqualTo(expected);
    }

    @Test
    void testCase4() {
        int n = 99999999;

        int expected = 72;

        assertThat(sumPositionalNumber.solution(n)).isEqualTo(expected);
    }
}