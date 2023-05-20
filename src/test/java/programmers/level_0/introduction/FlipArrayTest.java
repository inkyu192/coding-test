package programmers.level_0.introduction;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("배열 뒤집기")
class FlipArrayTest {

    FlipArray test = new FlipArray();

    @Test
    void case1() {
        int[] num_list = {1, 2, 3, 4, 5};

        int[] result = {5, 4, 3, 2, 1};

        assertThat(test.solution(num_list)).isEqualTo(result);
    }

    @Test
    void case2() {
        int[] num_list = {1, 1, 1, 1, 1, 2};

        int[] result = {2, 1, 1, 1, 1, 1};

        assertThat(test.solution(num_list)).isEqualTo(result);
    }

    @Test
    void case3() {
        int[] num_list = {1, 0, 1, 1, 1, 3, 5};

        int[] result = {5, 3, 1, 1, 1, 0, 1};

        assertThat(test.solution(num_list)).isEqualTo(result);
    }
}