package programmers.level_0.introduction;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("피자 나눠 먹기 (1)")
class SharePizzaOneTest {

    SharePizzaOne test = new SharePizzaOne();

    @Test
    void case1() {
        int n = 7;

        int result = 1;

        assertThat(test.solution(n)).isEqualTo(result);
    }

    @Test
    void case2() {
        int n = 1;

        int result = 1;

        assertThat(test.solution(n)).isEqualTo(result);
    }
    @Test
    void case3() {
        int n = 15;

        int result = 3;

        assertThat(test.solution(n)).isEqualTo(result);
    }
}