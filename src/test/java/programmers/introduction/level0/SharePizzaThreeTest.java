package programmers.introduction.level0;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("피자 나눠 먹기 (3)")
class SharePizzaThreeTest {

    SharePizzaThree sharePizzaThree = new SharePizzaThree();

    @Test
    void testCase1() {
        int slice = 7;
        int n = 10;

        int expected = 2;

        assertThat(sharePizzaThree.solution(slice, n)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int slice = 4;
        int n = 12;

        int expected = 3;

        assertThat(sharePizzaThree.solution(slice, n)).isEqualTo(expected);
    }

    @Test
    void testCase3() {
        int slice = 8;
        int n = 4;

        int expected = 1;

        assertThat(sharePizzaThree.solution(slice, n)).isEqualTo(expected);
    }
}