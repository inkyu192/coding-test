package programmers.level_0.basictraining.method;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("배열 비교하기")
class CompareArraysTest {

    CompareArrays test = new CompareArrays();

    @Test
    void case1() {
        int[] arr1 = {49, 13};
        int[] arr2 = {70, 11, 2};

        int result = -1;

        assertThat(test.solution(arr1, arr2)).isEqualTo(result);
    }

    @Test
    void case2() {
        int[] arr1 = {100, 17, 84, 1};
        int[] arr2 = {55, 12, 65, 36};

        int result = 1;

        assertThat(test.solution(arr1, arr2)).isEqualTo(result);
    }

    @Test
    void case3() {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 3, 3, 3, 3};

        int result = 0;

        assertThat(test.solution(arr1, arr2)).isEqualTo(result);
    }
}