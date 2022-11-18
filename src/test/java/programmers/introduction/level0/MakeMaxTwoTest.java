package programmers.introduction.level0;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("최댓값 만들기 (2)")
class MakeMaxTwoTest {

    MakeMaxTwo makeMaxTwo = new MakeMaxTwo();

    @Test
    void testCase1() {
        int[] numbers = {1, 2, -3, 4, -5};

        int expected = 15;

        assertThat(makeMaxTwo.solution(numbers)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int[] numbers = {0, -31, 24, 10, 1, 9};

        int expected = 240;

        assertThat(makeMaxTwo.solution(numbers)).isEqualTo(expected);
    }

    @Test
    void testCase3() {
        int[] numbers = {10, 20, 30, 5, 5, 20, 5};

        int expected = 600;

        assertThat(makeMaxTwo.solution(numbers)).isEqualTo(expected);
    }
}