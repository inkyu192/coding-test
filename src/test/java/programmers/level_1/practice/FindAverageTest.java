package programmers.level_1.practice;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("평균 구하기")
class FindAverageTest {

    FindAverage findAverage;

    @BeforeEach
    void beforeEach() {
        findAverage = new FindAverage();
    }

    @Test
    void case1() {
        int[] arr = {1, 2, 3, 4};
        double expected = 2.5;

        Assertions.assertThat(findAverage.solution(arr)).isEqualTo(expected);
    }

    @Test
    void case2() {
        int[] arr = {5, 5};
        double expected = 5;

        Assertions.assertThat(findAverage.solution(arr)).isEqualTo(expected);
    }
}