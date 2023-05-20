package programmers.level_0.introduction;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("유한소수 판별하기")
class DetermineFinitePrimeTest {

    DetermineFinitePrime test = new DetermineFinitePrime();

    @Test
    void case1() {
        int a = 7;
        int b = 20;

        int result = 1;

        assertThat(test.solution(a, b)).isEqualTo(result);
    }

    @Test
    void case2() {
        int a = 11;
        int b = 22;

        int result = 1;

        assertThat(test.solution(a, b)).isEqualTo(result);
    }

    @Test
    void case3() {
        int a = 12;
        int b = 21;

        int result = 2;

        assertThat(test.solution(a, b)).isEqualTo(result);
    }
}