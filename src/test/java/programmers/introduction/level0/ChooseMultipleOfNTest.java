package programmers.introduction.level0;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("n의 배수 고르기")
class ChooseMultipleOfNTest {

    ChooseMultipleOfN chooseMultipleOfN = new ChooseMultipleOfN();

    @Test
    void testCase1() {
        int n = 3;
        int[] numlist = {4, 5, 6, 7, 8, 9, 10, 11, 12};

        int[] expected = {6, 9, 12};

        assertThat(chooseMultipleOfN.solution(n, numlist)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int n = 5;
        int[] numlist = {1, 9, 3, 10, 13, 5};

        int[] expected = {10, 5};

        assertThat(chooseMultipleOfN.solution(n, numlist)).isEqualTo(expected);
    }

    @Test
    void testCase3() {
        int n = 12;
        int[] numlist = {2, 100, 120, 600, 12, 12};

        int[] expected = {120, 600, 12, 12};

        assertThat(chooseMultipleOfN.solution(n, numlist)).isEqualTo(expected);
    }
}