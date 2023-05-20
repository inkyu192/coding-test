package programmers.level_0.introduction;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("배열 자르기")
class CutArrayTest {

    CutArray test = new CutArray();

    @Test
    void case1() {
        int[] numbers = {1, 2, 3, 4, 5};
        int num1 = 1;
        int num2 = 3;

        int[] result = {2, 3, 4};

        assertThat(test.solution(numbers, num1, num2)).isEqualTo(result);
    }

    @Test
    void case2() {
        int[] numbers = {1, 3, 5};
        int num1 = 1;
        int num2 = 2;

        int[] result = {3, 5};

        assertThat(test.solution(numbers, num1, num2)).isEqualTo(result);
    }
}