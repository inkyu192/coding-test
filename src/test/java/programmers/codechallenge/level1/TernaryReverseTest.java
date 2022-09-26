package programmers.codechallenge.level1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("3진법 뒤집기")
class TernaryReverseTest {

    TernaryReverse ternaryReverse = new TernaryReverse();

    @Test
    void testCase1() {
        int n = 45;

        int expected = 7;

        assertThat(ternaryReverse.solution(n)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int n = 125;

        int expected = 229;

        assertThat(ternaryReverse.solution(n)).isEqualTo(expected);
    }
}