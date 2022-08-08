package programmers.practice.level1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("x만큼 간격이 있는 n개의 숫자")
class NNumbersSpacedByXTest {

    NNumbersSpacedByX nNumbersSpacedByX = new NNumbersSpacedByX();

    @Test
    void testCase1() {
        int x = 2;
        int n = 5;

        long[] expected = {2, 4, 6, 8, 10};

        assertThat(nNumbersSpacedByX.solution(x, n)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int x = 4;
        int n = 3;

        long[] expected = {4, 8, 12};

        assertThat(nNumbersSpacedByX.solution(x, n)).isEqualTo(expected);
    }

    @Test
    void testCase3() {
        int x = -4;
        int n = 2;

        long[] expected = {-4, -8};

        assertThat(nNumbersSpacedByX.solution(x, n)).isEqualTo(expected);
    }
}