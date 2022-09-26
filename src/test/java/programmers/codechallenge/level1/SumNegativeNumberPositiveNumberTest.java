package programmers.codechallenge.level1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("음양 더하기")
class SumNegativeNumberPositiveNumberTest {

    SumNegativeNumberPositiveNumber sumNegativeNumberPositiveNumber = new SumNegativeNumberPositiveNumber();

    @Test
    void testCase1() {
        int[] absolutes = {4, 7, 12};
        boolean[] signs = {true, false, true};

        int expected = 9;

        assertThat(sumNegativeNumberPositiveNumber.solution(absolutes, signs)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int[] absolutes = {1, 2, 3};
        boolean[] signs = {false, false, true};

        int expected = 0;

        assertThat(sumNegativeNumberPositiveNumber.solution(absolutes, signs)).isEqualTo(expected);
    }
}