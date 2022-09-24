package programmers.practice.level2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("N-Queen")
class NQueenTest {

    NQueen nQueen = new NQueen();

    @Test
    void testCase1() {
        int n = 4;

        int expected = 2;

        assertThat(nQueen.solution(n)).isEqualTo(expected);
    }
}