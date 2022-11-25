package programmers.practice.level2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("최솟값 만들기")
class MakeMinValueTest {

    MakeMinValue makeMinValue = new MakeMinValue();

    @Test
    void testCase1() {
        int[] A = {1, 4, 2};
        int[] B = {5, 4, 4};

        int expected = 29;

        assertThat(makeMinValue.solution(A, B)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int[] A = {1, 2};
        int[] B = {3, 4};

        int expected = 10;

        assertThat(makeMinValue.solution(A, B)).isEqualTo(expected);
    }
}