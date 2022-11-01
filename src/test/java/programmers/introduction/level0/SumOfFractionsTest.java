package programmers.introduction.level0;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("분수의 덧셈")
class SumOfFractionsTest {

    SumOfFractions sumOfFractions = new SumOfFractions();

    @Test
    void testCase1() {
        int denum1 = 1;
        int num1 = 2;
        int denum2 = 3;
        int num2 = 4;

        int[] expected = {5, 4};

        assertThat(sumOfFractions.solution(denum1, num1, denum2, num2)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int denum1 = 9;
        int num1 = 2;
        int denum2 = 1;
        int num2 = 3;

        int[] expected = {29, 6};

        assertThat(sumOfFractions.solution(denum1, num1, denum2, num2)).isEqualTo(expected);
    }
}