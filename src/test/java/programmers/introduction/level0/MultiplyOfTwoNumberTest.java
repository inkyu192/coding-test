package programmers.introduction.level0;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("두 수의 곱")
class MultiplyOfTwoNumberTest {

    MultiplyOfTwoNumber multiplyOfTwoNumber = new MultiplyOfTwoNumber();

    @Test
    void testCase1() {
        int num1 = 3;
        int num2 = 4;

        int expected = 12;

        assertThat(multiplyOfTwoNumber.solution(num1, num2)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int num1 = 27;
        int num2 = 19;

        int expected = 513;

        assertThat(multiplyOfTwoNumber.solution(num1, num2)).isEqualTo(expected);
    }
}