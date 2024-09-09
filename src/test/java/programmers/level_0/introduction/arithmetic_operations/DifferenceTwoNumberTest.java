package programmers.level_0.introduction.arithmetic_operations;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("두 수의 차")
class DifferenceTwoNumberTest {

    DifferenceTwoNumber test = new DifferenceTwoNumber();

    @Test
    void case1() {
        int num1 = 2;
        int num2 = 3;

        int result = -1;

        assertThat(test.solution(num1, num2)).isEqualTo(result);
    }

    @Test
    void case2() {
        int num1 = 100;
        int num2 = 2;

        int result = 98;

        assertThat(test.solution(num1, num2)).isEqualTo(result);
    }
}