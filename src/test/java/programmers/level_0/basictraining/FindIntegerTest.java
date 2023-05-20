package programmers.level_0.basictraining;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("정수 찾기")
class FindIntegerTest {

    FindInteger test = new FindInteger();

    @Test
    void case1() {
        int[] num_list = {1, 2, 3, 4, 5};
        int n = 3;

        int result = 1;

        assertThat(test.solution(num_list, n)).isEqualTo(result);
    }

    @Test
    void case2() {
        int[] num_list = {15, 98, 23, 2, 15};
        int n = 20;

        int result = 0;

        assertThat(test.solution(num_list, n)).isEqualTo(result);
    }
}