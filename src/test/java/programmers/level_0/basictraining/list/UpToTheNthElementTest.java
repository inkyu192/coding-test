package programmers.level_0.basictraining.list;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("n 번째 원소까지")
class UpToTheNthElementTest {

    UpToTheNthElement test = new UpToTheNthElement();

    @Test
    void case1() {
        int[] num_list = {2, 1, 6};
        int n = 1;

        int[] result = {2};

        assertThat(test.solution(num_list, n)).isEqualTo(result);
    }

    @Test
    void case2() {
        int[] num_list = {5, 2, 1, 7, 5};
        int n = 3;

        int[] result = {5, 2, 1};

        assertThat(test.solution(num_list, n)).isEqualTo(result);
    }
}