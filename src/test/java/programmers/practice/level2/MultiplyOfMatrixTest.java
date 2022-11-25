package programmers.practice.level2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("행렬의 곱셈")
class MultiplyOfMatrixTest {

    MultiplyOfMatrix multiplyOfMatrix = new MultiplyOfMatrix();

    @Test
    void testCase1() {
        int[][] arr1 = {{1, 4}, {3, 2}, {4, 1}};
        int[][] arr2 = {{3, 3}, {3, 3}};

        int[][] expected = {{15, 15}, {15, 15}, {15, 15}};

        assertThat(multiplyOfMatrix.solution(arr1, arr2)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int[][] arr1 = {{2, 3, 2}, {4, 2, 4}, {3, 1, 4}};
        int[][] arr2 = {{5, 4, 3}, {2, 4, 1}, {3, 1, 1}};

        int[][] expected = {{22, 22, 11}, {36, 28, 18}, {29, 20, 14}};

        assertThat(multiplyOfMatrix.solution(arr1, arr2)).isEqualTo(expected);
    }
}