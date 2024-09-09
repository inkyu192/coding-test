package programmers.level_0.introduction.day_2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("두 수의 나눗셈")
class DivisionTwoNumberTest {

    DivisionTwoNumber test = new DivisionTwoNumber();

    @Test
    void case1() {
        int num1 = 3;
        int num2 = 2;

        int result = 1500;

        assertThat(test.solution(num1, num2)).isEqualTo(result);
    }

    @Test
    void case2() {
        int num1 = 7;
        int num2 = 3;

        int result = 2333;

        assertThat(test.solution(num1, num2)).isEqualTo(result);
    }
    @Test
    void case3() {
        int num1 = 1;
        int num2 = 16;

        int result = 62;

        assertThat(test.solution(num1, num2)).isEqualTo(result);
    }
}