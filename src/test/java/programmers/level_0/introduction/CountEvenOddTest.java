package programmers.level_0.introduction;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("짝수 홀수 개수")
class CountEvenOddTest {

    CountEvenOdd test = new CountEvenOdd();

    @Test
    void case1() {
        int[] num_list = {1, 2, 3, 4, 5};

        int[] result = {2, 3};

        assertThat(test.solution(num_list)).isEqualTo(result);
    }

    @Test
    void case2() {
        int[] num_list = {1, 3, 5, 7};

        int[] result = {0, 4};

        assertThat(test.solution(num_list)).isEqualTo(result);
    }
}