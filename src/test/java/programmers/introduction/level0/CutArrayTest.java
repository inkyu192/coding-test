package programmers.introduction.level0;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("배열 자르기")
class CutArrayTest {

    CutArray cutArray = new CutArray();

    @Test
    void testCase1() {
        int[] numbers = {1, 2, 3, 4, 5};
        int num1 = 1;
        int num2 = 3;

        int[] expected = {2, 3, 4};

        assertThat(cutArray.solution(numbers, num1, num2)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int[] numbers = {1, 3, 5};
        int num1 = 1;
        int num2 = 2;

        int[] expected = {3, 5};

        assertThat(cutArray.solution(numbers, num1, num2)).isEqualTo(expected);
    }
}