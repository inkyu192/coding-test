package programmers.introduction.level0;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("두 수의 차")
class DiffOfTwoNumberTest {

    DiffOfTwoNumber diffOfTwoNumber = new DiffOfTwoNumber();

    @Test
    void testCase1() {
        int num1 = 2;
        int num2 = 3;

        int expected = -1;

        assertThat(diffOfTwoNumber.solution(num1, num2)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int num1 = 100;
        int num2 = 2;

        int expected = 98;

        assertThat(diffOfTwoNumber.solution(num1, num2)).isEqualTo(expected);
    }
}