package programmers.introduction.level0;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("배열 회전시키기")
class RotateArrayTest {

    RotateArray rotateArray = new RotateArray();

    @Test
    void testCase1() {
        int[] numbers = {1, 2, 3};
        String direction = "right";

        int[] expected = {3, 1, 2};

        assertThat(rotateArray.solution(numbers, direction)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int[] numbers = {4, 455, 6, 4, -1, 45, 6};
        String direction = "left";

        int[] expected = {455, 6, 4, -1, 45, 6, 4};

        assertThat(rotateArray.solution(numbers, direction)).isEqualTo(expected);
    }
}