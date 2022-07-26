package programmers.lv1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("약수의 합")
class SumOfDivisorTest {

    SumOfDivisor sumOfDivisor = new SumOfDivisor();

    @Test
    void testCase1() {
        int n = 12;

        int expected = 28;

        assertThat(sumOfDivisor.solution(n)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int n = 5;

        int expected = 6;

        assertThat(sumOfDivisor.solution(n)).isEqualTo(expected);
    }
}