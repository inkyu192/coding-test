package programmers.level_0.basictraining;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("이어 붙인 수")
class NumberOfConcatenationsTest {

    NumberOfConcatenations test = new NumberOfConcatenations();

    @Test
    void case1() {
        int[] num_list = {3, 4, 5, 2, 1};

        int result = 393;

        assertThat(test.solution(num_list)).isEqualTo(result);
    }

    @Test
    void case2() {
        int[] num_list = {5, 7, 8, 3};

        int result = 581;

        assertThat(test.solution(num_list)).isEqualTo(result);
    }
}