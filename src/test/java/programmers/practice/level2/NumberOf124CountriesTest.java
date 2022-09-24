package programmers.practice.level2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("124 나라의 숫자")
class NumberOf124CountriesTest {

    NumberOf124Countries numberOf124Countries = new NumberOf124Countries();

    @Test
    void testCase1() {
        int n = 1;

        String expected = "1";

        assertThat(numberOf124Countries.solution(n)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int n = 2;

        String expected = "2";

        assertThat(numberOf124Countries.solution(n)).isEqualTo(expected);
    }

    @Test
    void testCase3() {
        int n = 3;

        String expected = "4";

        assertThat(numberOf124Countries.solution(n)).isEqualTo(expected);
    }

    @Test
    void testCase4() {
        int n = 4;

        String expected = "11";

        assertThat(numberOf124Countries.solution(n)).isEqualTo(expected);
    }

    @Test
    void testCase5() {
        int n = 77;

        String expected = "2212";

        assertThat(numberOf124Countries.solution(n)).isEqualTo(expected);
    }
}