package programmers.level_0.introduction;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("소인수분해")
class ActorizationInPrimeFactorsTest {

    ActorizationInPrimeFactors test = new ActorizationInPrimeFactors();

    @Test
    void case1() {
        int n = 12;

        int[] result = {2, 3};

        assertThat(test.solution(n)).isEqualTo(result);
    }

    @Test
    void case2() {
        int n = 17;

        int[] result = {17};

        assertThat(test.solution(n)).isEqualTo(result);
    }

    @Test
    void case3() {
        int n = 420;

        int[] result = {2, 3, 5, 7};

        assertThat(test.solution(n)).isEqualTo(result);
    }
}