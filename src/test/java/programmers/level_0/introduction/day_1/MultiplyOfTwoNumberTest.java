package programmers.level_0.introduction.day_1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("두 수의 곱")
class MultiplyOfTwoNumberTest {

    MultiplyOfTwoNumber test = new MultiplyOfTwoNumber();

    @Test
    void case1() {
        int num1 = 3;
        int num2 = 4;

        int result = 12;

        assertThat(test.solution(num1, num2)).isEqualTo(result);
    }

    @Test
    void case2() {
        int num1 = 27;
        int num2 = 19;

        int result = 513;

        assertThat(test.solution(num1, num2)).isEqualTo(result);
    }
}