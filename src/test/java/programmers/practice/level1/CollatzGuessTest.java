package programmers.practice.level1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("콜라츠 추측")
class CollatzGuessTest {

    CollatzGuess collatzGuess = new CollatzGuess();

    @Test
    void testCase1() {
        int n = 6;

        int expected = 8;

        assertThat(collatzGuess.solution(n)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int n = 16;

        int expected = 4;

        assertThat(collatzGuess.solution(n)).isEqualTo(expected);
    }

    @Test
    void testCase3() {
        int n = 626331;

        int expected = -1;

        assertThat(collatzGuess.solution(n)).isEqualTo(expected);
    }
}