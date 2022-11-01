package programmers.introduction.level0;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("겹치는 선분의 길이")
class LengthOfOverlappingLineSegmentsTest {

    LengthOfOverlappingLineSegments lengthOfOverlappingLineSegments = new LengthOfOverlappingLineSegments();

    @Test
    void testCase1() {
        int[][] lines = {{0, 1}, {2, 5}, {3, 9}};

        int expected = 2;

        assertThat(lengthOfOverlappingLineSegments.solution(lines)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int[][] lines = {{-1, 1}, {1, 3}, {3, 9}};

        int expected = 0;

        assertThat(lengthOfOverlappingLineSegments.solution(lines)).isEqualTo(expected);
    }

    @Test
    void testCase3() {
        int[][] lines = {{0, 5}, {3, 9}, {1, 10}};

        int expected = 8;

        assertThat(lengthOfOverlappingLineSegments.solution(lines)).isEqualTo(expected);
    }
}