package programmers.level_0.basictraining;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("n 번째 원소부터")
class FromTheNthElementTest {

    FromTheNthElement test = new FromTheNthElement();

    @Test
    void case1() {
        int[] num_list = {2, 1, 6};
        int n = 3;

        int[] result = {6};

        assertThat(test.solution(num_list, n)).isEqualTo(result);
    }

    @Test
    void case2() {
        int[] num_list = {5, 2, 1, 7, 5};
        int n = 2;

        int[] result = {2, 1, 7, 5};

        assertThat(test.solution(num_list, n)).isEqualTo(result);
    }
}