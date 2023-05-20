package programmers.level_0.introduction;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("직사각형 넓이 구하기")
class GetAreaRectangleTest {

    GetAreaRectangle test = new GetAreaRectangle();

    @Test
    void case1() {
        int[][] dots = {{1, 1}, {2, 1}, {2, 2}, {1, 2}};
        int result = 1;

        assertThat(test.solution(dots)).isEqualTo(result);
    }

    @Test
    void case2() {
        int[][] dots = {{-1, -1}, {1, 1}, {1, -1}, {-1, 1}};
        int result = 4;

        assertThat(test.solution(dots)).isEqualTo(result);
    }
}