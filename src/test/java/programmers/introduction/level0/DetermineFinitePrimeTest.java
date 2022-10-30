package programmers.introduction.level0;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("유한소수 판별하기")
class DetermineFinitePrimeTest {

    DetermineFinitePrime determineFinitePrime = new DetermineFinitePrime();

    @Test
    void testCase1() {
        int a = 7;
        int b = 20;

        int expected = 1;

        assertThat(determineFinitePrime.solution(a, b)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int a = 11;
        int b = 22;

        int expected = 1;

        assertThat(determineFinitePrime.solution(a, b)).isEqualTo(expected);
    }

    @Test
    void testCase3() {
        int a = 12;
        int b = 21;

        int expected = 2;

        assertThat(determineFinitePrime.solution(a, b)).isEqualTo(expected);
    }
}