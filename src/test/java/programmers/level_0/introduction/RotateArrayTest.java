package programmers.level_0.introduction;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("배열 회전시키기")
class RotateArrayTest {

    RotateArray test = new RotateArray();

    @Test
    void case1() {
        int[] numbers = {1, 2, 3};
        String direction = "right";

        int[] result = {3, 1, 2};

        assertThat(test.solution(numbers, direction)).isEqualTo(result);
    }

    @Test
    void case2() {
        int[] numbers = {4, 455, 6, 4, -1, 45, 6};
        String direction = "left";

        int[] result = {455, 6, 4, -1, 45, 6, 4};

        assertThat(test.solution(numbers, direction)).isEqualTo(result);
    }
}