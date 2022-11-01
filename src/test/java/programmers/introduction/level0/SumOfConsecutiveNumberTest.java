package programmers.introduction.level0;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("연속된 수의 합")
class SumOfConsecutiveNumberTest {

    SumOfConsecutiveNumber sumOfConsecutiveNumber = new SumOfConsecutiveNumber();

    @Test
    void testCase1() {
        int num = 3;
        int total = 12;

        int[] expected = {3, 4, 5};

        assertThat(sumOfConsecutiveNumber.solution(num, total)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int num = 5;
        int total = 15;

        int[] expected = {1, 2, 3, 4, 5};

        assertThat(sumOfConsecutiveNumber.solution(num, total)).isEqualTo(expected);
    }

    @Test
    void testCase3() {
        int num = 4;
        int total = 14;

        int[] expected = {2, 3, 4, 5};

        assertThat(sumOfConsecutiveNumber.solution(num, total)).isEqualTo(expected);
    }

    @Test
    void testCase4() {
        int num = 5;
        int total = 5;

        int[] expected = {-1, 0, 1, 2, 3};

        assertThat(sumOfConsecutiveNumber.solution(num, total)).isEqualTo(expected);
    }
}