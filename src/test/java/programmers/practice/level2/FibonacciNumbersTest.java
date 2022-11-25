package programmers.practice.level2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("피보나치 수")
class FibonacciNumbersTest {

    FibonacciNumbers fibonacciNumbers = new FibonacciNumbers();

    @Test
    void testCase1() {
        int n = 3;

        int expected = 2;

        assertThat(fibonacciNumbers.solution(n)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int n = 5;

        int expected = 5;

        assertThat(fibonacciNumbers.solution(n)).isEqualTo(expected);
    }
}