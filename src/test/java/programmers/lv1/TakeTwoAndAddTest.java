package programmers.lv1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("두 개 뽑아서 더하기")
class TakeTwoAndAddTest {

    TakeTwoAndAdd takeTwoAndAdd = new TakeTwoAndAdd();

    @Test
    void testCase1() {
        int[] numbers = {2, 1, 3, 4, 1};

        int[] expected = {2, 3, 4, 5, 6, 7};

        assertThat(takeTwoAndAdd.solution(numbers)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int[] numbers = {5, 0, 2, 7};

        int[] expected = {2, 5, 7, 9, 12};

        assertThat(takeTwoAndAdd.solution(numbers)).isEqualTo(expected);
    }
}