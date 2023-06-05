package programmers.level_0.basictraining.calculation;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("두 수의 연산값 비교하기")
class ComparingTheOperationValueOfTwoNumbersTest {

    ComparingTheOperationValueOfTwoNumbers test = new ComparingTheOperationValueOfTwoNumbers();

    @Test
    void case1() {
        int a = 2;
        int b = 91;

        int result = 364;

        assertThat(test.solution(a, b)).isEqualTo(result);
    }

    @Test
    void case2() {
        int a = 91;
        int b = 2;

        int result = 912;

        assertThat(test.solution(a, b)).isEqualTo(result);
    }
}