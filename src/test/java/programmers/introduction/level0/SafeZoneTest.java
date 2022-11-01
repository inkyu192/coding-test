package programmers.introduction.level0;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("안전지대")
class SafeZoneTest {

    SafeZone safeZone = new SafeZone();

    @Test
    void testCase1() {
        int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 0, 0}};

        int expected = 16;

        assertThat(safeZone.solution(board)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 1, 0}, {0, 0, 0, 0, 0}};

        int expected = 13;

        assertThat(safeZone.solution(board)).isEqualTo(expected);
    }

    @Test
    void testCase3() {
        int[][] board = {{1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}};

        int expected = 0;

        assertThat(safeZone.solution(board)).isEqualTo(expected);
    }
}