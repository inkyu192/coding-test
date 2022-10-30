package programmers.introduction.level0;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("숫자 비교하기")
class CompareNumberTest {

    CompareNumber compareNumber = new CompareNumber();

    @Test
    void testCase1() {
        int num1 = 2;
        int num2 = 3;

        int expected = -1;

        assertThat(compareNumber.solution(num1, num2)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int num1 = 11;
        int num2 = 11;

        int expected = 1;

        assertThat(compareNumber.solution(num1, num2)).isEqualTo(expected);
    }

    @Test
    void testCase3() {
        int num1 = 7;
        int num2 = 99;

        int expected = -1;

        assertThat(compareNumber.solution(num1, num2)).isEqualTo(expected);
    }
}