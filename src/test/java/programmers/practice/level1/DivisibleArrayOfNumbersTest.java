package programmers.practice.level1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("나누어 떨어지는 숫자 배열")
class DivisibleArrayOfNumbersTest {

    DivisibleArrayOfNumbers divisibleArrayOfNumbers = new DivisibleArrayOfNumbers();

    @Test
    void testCase1() {
        int[] arr = {5, 9, 7, 10};
        int divisor = 5;

        int[] expected = {5, 10};

        assertThat(divisibleArrayOfNumbers.solution(arr, divisor)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int[] arr = {2, 36, 1, 3};
        int divisor = 1;

        int[] expected = {1, 2, 3, 36};

        assertThat(divisibleArrayOfNumbers.solution(arr, divisor)).isEqualTo(expected);
    }

    @Test
    void testCase3() {
        int[] arr = {3, 2, 6};
        int divisor = 10;

        int[] expected = {-1};

        assertThat(divisibleArrayOfNumbers.solution(arr, divisor)).isEqualTo(expected);
    }
}