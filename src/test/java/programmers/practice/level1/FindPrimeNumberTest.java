package programmers.practice.level1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("소수 찾기")
class FindPrimeNumberTest {

    FindPrimeNumber findPrimeNumber = new FindPrimeNumber();

    @Test
    void testCase1() {
        int n = 10;

        int expected = 4;

        assertThat(findPrimeNumber.solution(n)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int n = 5;

        int expected = 3;

        assertThat(findPrimeNumber.solution(n)).isEqualTo(expected);
    }
}