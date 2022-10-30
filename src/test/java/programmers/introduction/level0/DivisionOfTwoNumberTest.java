package programmers.introduction.level0;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("두 수의 나눗셈")
class DivisionOfTwoNumberTest {

    DivisionOfTwoNumber divisionOfTwoNumber = new DivisionOfTwoNumber();

    @Test
    void testCase1() {
        int num1 = 3;
        int num2 = 2;

        int expected = 1500;

        assertThat(divisionOfTwoNumber.solution(num1, num2)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int num1 = 7;
        int num2 = 3;

        int expected = 2333;

        assertThat(divisionOfTwoNumber.solution(num1, num2)).isEqualTo(expected);
    }
    @Test
    void testCase3() {
        int num1 = 1;
        int num2 = 16;

        int expected = 62;

        assertThat(divisionOfTwoNumber.solution(num1, num2)).isEqualTo(expected);
    }
}