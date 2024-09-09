package programmers.level_0.introduction.arithmetic_operations;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("두 수의 합")
class SumTwoNumberTest {

    SumTwoNumber test = new SumTwoNumber();

    @Test
    void case1() {
        int num1 = 2;
        int num2 = 3;

        int result = 5;

        assertThat(test.solution(num1, num2)).isEqualTo(result);
    }

    @Test
    void case2() {
        int num1 = 100;
        int num2 = 2;

        int result = 102;

        assertThat(test.solution(num1, num2)).isEqualTo(result);
    }
}