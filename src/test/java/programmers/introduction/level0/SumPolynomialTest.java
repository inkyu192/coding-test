package programmers.introduction.level0;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("다항식 더하기")
class SumPolynomialTest {

    SumPolynomial sumPolynomial = new SumPolynomial();

    @Test
    void testCase1() {
        String polynomial = "3x + 7 + x";

        String expected = "4x + 7";

        assertThat(sumPolynomial.solution(polynomial)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        String polynomial = "x + x + x";

        String expected = "3x";

        assertThat(sumPolynomial.solution(polynomial)).isEqualTo(expected);
    }

    @Test
    void testCase3() {
        String polynomial = "3 + 4";

        String expected = "7";

        assertThat(sumPolynomial.solution(polynomial)).isEqualTo(expected);
    }
}