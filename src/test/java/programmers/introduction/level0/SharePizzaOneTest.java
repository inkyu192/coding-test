package programmers.introduction.level0;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("피자 나눠 먹기 (1)")
class SharePizzaOneTest {

    SharePizzaOne sharePizzaOne = new SharePizzaOne();

    @Test
    void testCase1() {
        int n = 7;

        int expected = 1;

        assertThat(sharePizzaOne.solution(n)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int n = 1;

        int expected = 1;

        assertThat(sharePizzaOne.solution(n)).isEqualTo(expected);
    }
    @Test
    void testCase3() {
        int n = 15;

        int expected = 3;

        assertThat(sharePizzaOne.solution(n)).isEqualTo(expected);
    }
}