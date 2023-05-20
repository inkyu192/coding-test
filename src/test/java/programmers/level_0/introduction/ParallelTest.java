package programmers.level_0.introduction;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("평행")
class ParallelTest {

    Parallel test = new Parallel();

    @Test
    void case1() {
        int[][] dots = {{1, 4}, {9, 2}, {3, 8}, {11, 6}};

        int result = 1;

        assertThat(test.solution(dots)).isEqualTo(result);
    }

    @Test
    void case2() {
        int[][] dots = {{3, 5}, {4, 1}, {2, 4}, {5, 10}};

        int result = 0;

        assertThat(test.solution(dots)).isEqualTo(result);
    }
}