package programmers.fullsearch.level2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("소수 찾기")
class FindPrimeNumberTest {

    FindPrimeNumber findPrimeNumber = new FindPrimeNumber();

    @Test
    void testCase1() {
        String numbers = "17";

        int expected = 3;

        assertThat(findPrimeNumber.solution(numbers)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        String numbers = "011";

        int expected = 2;

        assertThat(findPrimeNumber.solution(numbers)).isEqualTo(expected);
    }

    @Test
    void testCase3() {
        String numbers = "101";

        int expected = 2;

        assertThat(findPrimeNumber.solution(numbers)).isEqualTo(expected);
    }

    @Test
    void testCase4() {
        String numbers = "175";

        int expected = 7;

        assertThat(findPrimeNumber.solution(numbers)).isEqualTo(expected);
    }
}