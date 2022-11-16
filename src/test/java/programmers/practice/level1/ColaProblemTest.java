package programmers.practice.level1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("콜라 문제")
class ColaProblemTest {

    ColaProblem colaProblem = new ColaProblem();

    @Test
    void testCase1() {
        int a = 2;
        int b = 1;
        int n = 20;

        int expected = 19;

        assertThat(colaProblem.solution(a, b, n)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int a = 3;
        int b = 1;
        int n = 20;

        int expected = 9;

        assertThat(colaProblem.solution(a, b, n)).isEqualTo(expected);
    }
}