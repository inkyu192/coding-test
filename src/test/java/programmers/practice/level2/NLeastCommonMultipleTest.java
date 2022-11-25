package programmers.practice.level2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("N개의 최소공배수")
class NLeastCommonMultipleTest {

    NLeastCommonMultiple nLeastCommonMultiple = new NLeastCommonMultiple();

    @Test
    void testCase1() {
        int[] arr = {2, 6, 8, 14};

        int expected = 168;

        assertThat(nLeastCommonMultiple.solution(arr)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int[] arr = {1, 2, 3};

        int expected = 6;

        assertThat(nLeastCommonMultiple.solution(arr)).isEqualTo(expected);
    }
}