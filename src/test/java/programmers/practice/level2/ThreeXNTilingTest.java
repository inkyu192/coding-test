package programmers.practice.level2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("3 x n 타일링")
class ThreeXNTilingTest {

    ThreeXNTiling threeXNTiling = new ThreeXNTiling();

    @Test
    void testCase1() {
        int n = 4;

        int expected = 11;

        assertThat(threeXNTiling.solution(n)).isEqualTo(expected);
    }
}