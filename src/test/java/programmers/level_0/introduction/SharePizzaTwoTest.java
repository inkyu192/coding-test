package programmers.level_0.introduction;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("피자 나눠 먹기 (2)")
class SharePizzaTwoTest {

    SharePizzaTwo test = new SharePizzaTwo();

    @Test
    void case1() {
        int n = 6;

        int result = 1;

        assertThat(test.solution(n)).isEqualTo(result);
    }

    @Test
    void case2() {
        int n = 10;

        int result = 5;

        assertThat(test.solution(n)).isEqualTo(result);
    }

    @Test
    void case3() {
        int n = 4;

        int result = 2;

        assertThat(test.solution(n)).isEqualTo(result);
    }
}