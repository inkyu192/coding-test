package programmers.level_0.basictraining.list;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("n보다 커질 때까지 더하기")
class AddUntilGreaterThanNTest {

    AddUntilGreaterThanN test = new AddUntilGreaterThanN();

    @Test
    void case1() {
        int[] numbers = {34, 5, 71, 29, 100, 34};
        int n = 123;

        int result = 139;

        assertThat(test.solution(numbers, n)).isEqualTo(result);
    }

    @Test
    void case2() {
        int[] numbers = {58, 44, 27, 10, 100};
        int n = 139;

        int result = 239;

        assertThat(test.solution(numbers, n)).isEqualTo(result);
    }
}