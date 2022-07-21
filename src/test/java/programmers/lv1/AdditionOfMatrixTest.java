package programmers.lv1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("행렬의 덧셈")
class AdditionOfMatrixTest {

    AdditionOfMatrix additionOfMatrix = new AdditionOfMatrix();

    @Test
    void testCase1() {
        int[][] arr1 = {{1, 2}, {2, 3}};
        int[][] arr2 = {{3, 4}, {5, 6}};

        int[][] expected =  {{4, 6}, {7, 9}};

        assertThat(additionOfMatrix.solution(arr1, arr2)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int[][] arr1 = {{1}, {2}};
        int[][] arr2 = {{3}, {4}};

        int[][] expected =  {{4}, {6}};

        assertThat(additionOfMatrix.solution(arr1, arr2)).isEqualTo(expected);
    }
}