package programmers.level_0.basictraining.condition;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("마지막 두 원소")
class LastTwoElementsTest {

    LastTwoElements test = new LastTwoElements();

    @Test
    void case1() {
        int[] num_list = {2, 1, 6};

        int[] result = {2, 1, 6, 5};

        assertThat(test.solution(num_list)).isEqualTo(result);
    }

    @Test
    void case2() {
        int[] num_list = {5, 2, 1, 7, 5};

        int[] result = {5, 2, 1, 7, 5, 10};

        assertThat(test.solution(num_list)).isEqualTo(result);
    }
}