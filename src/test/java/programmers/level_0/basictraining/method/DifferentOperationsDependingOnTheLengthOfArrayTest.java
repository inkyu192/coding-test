package programmers.level_0.basictraining.method;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("배열의 길이에 따라 다른 연산하기")
class DifferentOperationsDependingOnTheLengthOfArrayTest {

    DifferentOperationsDependingOnTheLengthOfArray test = new DifferentOperationsDependingOnTheLengthOfArray();

    @Test
    void case1() {
        int[] arr = {49, 12, 100, 276, 33};
        int n = 27;

        int[] result = {76, 12, 127, 276, 60};

        assertThat(test.solution(arr, n)).isEqualTo(result);
    }

    @Test
    void case2() {
        int[] arr = {444, 555, 666, 777};
        int n = 100;

        int[] result = {444, 655, 666, 877};

        assertThat(test.solution(arr, n)).isEqualTo(result);
    }
}