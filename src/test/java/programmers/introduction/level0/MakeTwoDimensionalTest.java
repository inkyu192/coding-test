package programmers.introduction.level0;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("2차원으로 만들기")
class MakeTwoDimensionalTest {

    MakeTwoDimensional makeTwoDimensional = new MakeTwoDimensional();

    @Test
    void testCase1() {
        int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8};
        int n = 2;

        int[][] expected = {{1, 2}, {3, 4}, {5, 6}, {7, 8}};

        assertThat(makeTwoDimensional.solution(num_list, n)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int[] num_list = {100, 95, 2, 4, 5, 6, 18, 33, 948};
        int n = 3;

        int[][] expected = {{100, 95, 2}, {4, 5, 6}, {18, 33, 948}};

        assertThat(makeTwoDimensional.solution(num_list, n)).isEqualTo(expected);
    }
}