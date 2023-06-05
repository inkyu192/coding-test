package programmers.level_0.basictraining.condition;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import programmers.level_0.basictraining.condition.MultiplicationAndSumOfElements;

import static org.assertj.core.api.Assertions.*;

@DisplayName("원소들의 곱과 합")
class MultiplicationAndSumOfElementsTest {

    MultiplicationAndSumOfElements test = new MultiplicationAndSumOfElements();

    @Test
    void case1() {
        int[] num_list = {3, 4, 5, 2, 1};

        int result = 1;

        assertThat(test.solution(num_list)).isEqualTo(result);
    }

    @Test
    void case2() {
        int[] num_list = {5, 7, 8, 3};

        int result = 0;

        assertThat(test.solution(num_list)).isEqualTo(result);
    }
}