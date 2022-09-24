package programmers.practice.level2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("2 x n 타일링")
class TwoXNTilingTest {

    TwoXNTiling twoXNTiling = new TwoXNTiling();

    @Test
    void testCase1() {
        int n = 4;

        int expected = 5;

        assertThat(twoXNTiling.solution(n)).isEqualTo(expected);
    }
}