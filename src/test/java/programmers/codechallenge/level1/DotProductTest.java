package programmers.codechallenge.level1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("내적")
class DotProductTest {

    DotProduct dotProduct = new DotProduct();

    @Test
    void testCase1() {
        int[] a = {1, 2, 3, 4};
        int[] b = {-3, -1, 0, 2};

        int expected = 3;

        assertThat(dotProduct.solution(a, b)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int[] a = {-1, 0, 1};
        int[] b = {1, 0, -1};

        int expected = -2;

        assertThat(dotProduct.solution(a, b)).isEqualTo(expected);
    }
}