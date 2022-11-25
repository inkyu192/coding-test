package programmers.practice.level2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("최댓값과 최솟값")
class MaxAndMinValueTest {

    MaxAndMinValue maxAndMinValue = new MaxAndMinValue();

    @Test
    void testCase1() {
        String s = "1 2 3 4";

        String expected = "1 4";

        assertThat(maxAndMinValue.solution(s)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        String s = "-1 -2 -3 -4";

        String expected = "-4 -1";

        assertThat(maxAndMinValue.solution(s)).isEqualTo(expected);
    }

    @Test
    void testCase3() {
        String s = "-1 -1";

        String expected = "-1 -1";

        assertThat(maxAndMinValue.solution(s)).isEqualTo(expected);
    }
}