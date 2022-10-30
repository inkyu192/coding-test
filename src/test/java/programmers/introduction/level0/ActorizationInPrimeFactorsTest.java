package programmers.introduction.level0;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("소인수분해")
class ActorizationInPrimeFactorsTest {

    ActorizationInPrimeFactors actorizationInPrimeFactors = new ActorizationInPrimeFactors();

    @Test
    void testCase1() {
        int n = 12;

        int[] expected = {2, 3};

        assertThat(actorizationInPrimeFactors.solution(n)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int n = 17;

        int[] expected = {17};

        assertThat(actorizationInPrimeFactors.solution(n)).isEqualTo(expected);
    }

    @Test
    void testCase3() {
        int n = 420;

        int[] expected = {2, 3, 5, 7};

        assertThat(actorizationInPrimeFactors.solution(n)).isEqualTo(expected);
    }
}