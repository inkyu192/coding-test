package programmers.level_0.introduction;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("겹치는 선분의 길이")
class LengthOfOverlappingLineSegmentsTest {

    LengthOfOverlappingLineSegments test = new LengthOfOverlappingLineSegments();

    @Test
    void case1() {
        int[][] lines = {{0, 1}, {2, 5}, {3, 9}};

        int result = 2;

        assertThat(test.solution(lines)).isEqualTo(result);
    }

    @Test
    void case2() {
        int[][] lines = {{-1, 1}, {1, 3}, {3, 9}};

        int result = 0;

        assertThat(test.solution(lines)).isEqualTo(result);
    }

    @Test
    void case3() {
        int[][] lines = {{0, 5}, {3, 9}, {1, 10}};

        int result = 8;

        assertThat(test.solution(lines)).isEqualTo(result);
    }
}