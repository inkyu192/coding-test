package programmers.codechallenge.level2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("n^2 배열 자르기")
class CutArrayTest {

    CutArray cutArray = new CutArray();

    @Test
    void testCase1() {
        int n = 3;
        long left = 2;
        long right = 5;

        int[] expected = {3, 2, 2, 3};

        assertThat(cutArray.solution(n, left, right)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int n = 4;
        long left = 7;
        long right = 14;

        int[] expected = {4, 3, 3, 3, 4, 4, 4, 4};

        assertThat(cutArray.solution(n, left, right)).isEqualTo(expected);
    }
}