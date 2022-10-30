package programmers.introduction.level0;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("피자 나눠 먹기 (2)")
class SharePizzaTwoTest {

    SharePizzaTwo sharePizzaTwo = new SharePizzaTwo();

    @Test
    void testCase1() {
        int n = 6;

        int expected = 1;

        assertThat(sharePizzaTwo.solution(n)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int n = 10;

        int expected = 5;

        assertThat(sharePizzaTwo.solution(n)).isEqualTo(expected);
    }

    @Test
    void testCase3() {
        int n = 4;

        int expected = 2;

        assertThat(sharePizzaTwo.solution(n)).isEqualTo(expected);
    }
}