package programmers.lv1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("평균 구하기")
class AverageTest {

    Average average = new Average();

    @Test
    void testCase1() {
        int[] arr = {1, 2, 3, 4};
        double answer = average.solution(arr);

        double expected = 2.5;

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int[] arr = {5, 5};
        double answer = average.solution(arr);

        double expected = 5;

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    void testCase3() {
        int[] arr = {-5, -5};
        double answer = average.solution(arr);

        double expected = -5;

        assertThat(answer).isEqualTo(expected);
    }
}