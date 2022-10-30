package programmers.introduction.level0;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("직사각형 넓이 구하기")
class GetAreaRectangleTest {

    GetAreaRectangle getAreaRectangle = new GetAreaRectangle();

    @Test
    void testCase1() {
        int[][] dots = {{1, 1}, {2, 1}, {2, 2}, {1, 2}};
        int expected = 1;

        assertThat(getAreaRectangle.solution(dots)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int[][] dots = {{-1, -1}, {1, 1}, {1, -1}, {-1, 1}};
        int expected = 4;

        assertThat(getAreaRectangle.solution(dots)).isEqualTo(expected);
    }
}