package programmers.fullsearch.level1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("최소직사각형")
class MinimumRectangleTest {

    MinimumRectangle minimumRectangle = new MinimumRectangle();

    @Test
    void testCase1() {
        int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};

        int expected = 4000;

        assertThat(minimumRectangle.solution(sizes)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int[][] sizes = {{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}};

        int expected = 120;

        assertThat(minimumRectangle.solution(sizes)).isEqualTo(expected);
    }

    @Test
    void testCase3() {
        int[][] sizes = {{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}};

        int expected = 133;

        assertThat(minimumRectangle.solution(sizes)).isEqualTo(expected);
    }
}