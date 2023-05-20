package programmers.level_0.introduction;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("다항식 더하기")
class SumPolynomialTest {

    SumPolynomial test = new SumPolynomial();

    @Test
    void case1() {
        String polynomial = "3x + 7 + x";

        String result = "4x + 7";

        assertThat(test.solution(polynomial)).isEqualTo(result);
    }

    @Test
    void case2() {
        String polynomial = "x + x + x";

        String result = "3x";

        assertThat(test.solution(polynomial)).isEqualTo(result);
    }

    @Test
    void case3() {
        String polynomial = "3 + 4";

        String result = "7";

        assertThat(test.solution(polynomial)).isEqualTo(result);
    }
}