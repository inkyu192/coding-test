package programmers.introduction.level0;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("배열 뒤집기")
class FlipArrayTest {

    FlipArray flipArray = new FlipArray();

    @Test
    void testCase1() {
        int[] num_list = {1, 2, 3, 4, 5};

        int[] expected = {5, 4, 3, 2, 1};

        assertThat(flipArray.solution(num_list)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int[] num_list = {1, 1, 1, 1, 1, 2};

        int[] expected = {2, 1, 1, 1, 1, 1};

        assertThat(flipArray.solution(num_list)).isEqualTo(expected);
    }

    @Test
    void testCase3() {
        int[] num_list = {1, 0, 1, 1, 1, 3, 5};

        int[] expected = {5, 3, 1, 1, 1, 0, 1};

        assertThat(flipArray.solution(num_list)).isEqualTo(expected);
    }
}