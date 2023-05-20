package programmers.level_0.introduction;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("배열의 평균값")
class AverageOfArrayTest {

    AverageOfArray averageOfArray = new AverageOfArray();

    @Test
    void case1() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        double result = 5.5;

        assertThat(averageOfArray.solution(numbers)).isEqualTo(result);
    }

    @Test
    void case2() {
        int[] numbers = {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};

        double result = 94.0;

        assertThat(averageOfArray.solution(numbers)).isEqualTo(result);
    }
}