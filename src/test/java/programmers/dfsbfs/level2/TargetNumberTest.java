package programmers.dfsbfs.level2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("타겟 넘버")
class TargetNumberTest {

    TargetNumber targetNumber = new TargetNumber();

    @Test
    void testCase1() {
        int[] numbers = {1, 1, 1, 1, 1};
        int target = 3;

        int expected = 5;

        assertThat(targetNumber.solution(numbers, target)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int[] numbers = {4, 1, 2, 1};
        int target = 4;

        int expected = 2;

        assertThat(targetNumber.solution(numbers, target)).isEqualTo(expected);
    }
}