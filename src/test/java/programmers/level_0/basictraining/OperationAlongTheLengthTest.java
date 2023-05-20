package programmers.level_0.basictraining;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("길이에 따른 연산")
class OperationAlongTheLengthTest {

    OperationAlongTheLength test = new OperationAlongTheLength();

    @Test
    void case1() {
        int[] num_list = {3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1};

        int result = 51;

        assertThat(test.solution(num_list)).isEqualTo(result);
    }

    @Test
    void case2() {
        int[] num_list = {2, 3, 4, 5};

        int result = 120;

        assertThat(test.solution(num_list)).isEqualTo(result);
    }
}