package programmers.introduction.level0;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("평행")
class ParallelTest {

    Parallel parallel = new Parallel();

    @Test
    void testCase1() {
        int[][] dots = {{1, 4}, {9, 2}, {3, 8}, {11, 6}};

        int expected = 1;

        assertThat(parallel.solution(dots)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int[][] dots = {{3, 5}, {4, 1}, {2, 4}, {5, 10}};

        int expected = 0;

        assertThat(parallel.solution(dots)).isEqualTo(expected);
    }
}