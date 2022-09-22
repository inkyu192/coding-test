package programmers.summerwintercoding.level1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("예산")
class BudgetTest {

    Budget budget = new Budget();

    @Test
    void testCase1() {
        int[] d = {1, 3, 2, 5, 4};
        int b = 9;

        int expected = 3;

        assertThat(budget.solution(d, b)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int[] d = {2, 2, 3, 3};
        int b = 10;

        int expected = 4;

        assertThat(budget.solution(d, b)).isEqualTo(expected);
    }
}