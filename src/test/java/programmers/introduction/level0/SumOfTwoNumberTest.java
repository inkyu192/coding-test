package programmers.introduction.level0;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("두 수의 합")
class SumOfTwoNumberTest {

    SumOfTwoNumber sumOfTwoNumber = new SumOfTwoNumber();

    @Test
    void testCase1() {
        int num1 = 2;
        int num2 = 3;

        int expected = 5;

        assertThat(sumOfTwoNumber.solution(num1, num2)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int num1 = 100;
        int num2 = 2;

        int expected = 102;

        assertThat(sumOfTwoNumber.solution(num1, num2)).isEqualTo(expected);
    }
}