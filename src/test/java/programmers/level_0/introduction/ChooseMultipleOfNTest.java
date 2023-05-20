package programmers.level_0.introduction;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("n의 배수 고르기")
class ChooseMultipleOfNTest {

    ChooseMultipleOfN test = new ChooseMultipleOfN();

    @Test
    void case1() {
        int n = 3;
        int[] numlist = {4, 5, 6, 7, 8, 9, 10, 11, 12};

        int[] result = {6, 9, 12};

        assertThat(test.solution(n, numlist)).isEqualTo(result);
    }

    @Test
    void case2() {
        int n = 5;
        int[] numlist = {1, 9, 3, 10, 13, 5};

        int[] result = {10, 5};

        assertThat(test.solution(n, numlist)).isEqualTo(result);
    }

    @Test
    void case3() {
        int n = 12;
        int[] numlist = {2, 100, 120, 600, 12, 12};

        int[] result = {120, 600, 12, 12};

        assertThat(test.solution(n, numlist)).isEqualTo(result);
    }
}