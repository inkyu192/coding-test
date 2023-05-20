package programmers.level_0.introduction;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("연속된 수의 합")
class SumOfConsecutiveNumberTest {

    SumOfConsecutiveNumber test = new SumOfConsecutiveNumber();

    @Test
    void case1() {
        int num = 3;
        int total = 12;

        int[] result = {3, 4, 5};

        assertThat(test.solution(num, total)).isEqualTo(result);
    }

    @Test
    void case2() {
        int num = 5;
        int total = 15;

        int[] result = {1, 2, 3, 4, 5};

        assertThat(test.solution(num, total)).isEqualTo(result);
    }

    @Test
    void case3() {
        int num = 4;
        int total = 14;

        int[] result = {2, 3, 4, 5};

        assertThat(test.solution(num, total)).isEqualTo(result);
    }

    @Test
    void case4() {
        int num = 5;
        int total = 5;

        int[] result = {-1, 0, 1, 2, 3};

        assertThat(test.solution(num, total)).isEqualTo(result);
    }
}