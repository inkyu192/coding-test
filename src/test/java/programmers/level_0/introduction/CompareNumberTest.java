package programmers.level_0.introduction;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("숫자 비교하기")
class CompareNumberTest {

    CompareNumber test = new CompareNumber();

    @Test
    void case1() {
        int num1 = 2;
        int num2 = 3;

        int result = -1;

        assertThat(test.solution(num1, num2)).isEqualTo(result);
    }

    @Test
    void case2() {
        int num1 = 11;
        int num2 = 11;

        int result = 1;

        assertThat(test.solution(num1, num2)).isEqualTo(result);
    }

    @Test
    void case3() {
        int num1 = 7;
        int num2 = 99;

        int result = -1;

        assertThat(test.solution(num1, num2)).isEqualTo(result);
    }
}