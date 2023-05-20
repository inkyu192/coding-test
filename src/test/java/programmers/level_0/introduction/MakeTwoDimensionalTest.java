package programmers.level_0.introduction;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("2차원으로 만들기")
class MakeTwoDimensionalTest {

    MakeTwoDimensional test = new MakeTwoDimensional();

    @Test
    void case1() {
        int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8};
        int n = 2;

        int[][] result = {{1, 2}, {3, 4}, {5, 6}, {7, 8}};

        assertThat(test.solution(num_list, n)).isEqualTo(result);
    }

    @Test
    void case2() {
        int[] num_list = {100, 95, 2, 4, 5, 6, 18, 33, 948};
        int n = 3;

        int[][] result = {{100, 95, 2}, {4, 5, 6}, {18, 33, 948}};

        assertThat(test.solution(num_list, n)).isEqualTo(result);
    }
}