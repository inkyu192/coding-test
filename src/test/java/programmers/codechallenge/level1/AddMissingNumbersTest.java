package programmers.codechallenge.level1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("없는 숫자 더하기")
class AddMissingNumbersTest {

    AddMissingNumbers addMissingNumbers = new AddMissingNumbers();

    @Test
    void testCase1() {
        int[] numbers = {1, 2, 3, 4, 6, 7, 8, 0};

        int expected = 14;

        assertThat(addMissingNumbers.solution(numbers)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int[] numbers = {5, 8, 4, 0, 6, 7, 9};

        int expected = 6;

        assertThat(addMissingNumbers.solution(numbers)).isEqualTo(expected);
    }
}