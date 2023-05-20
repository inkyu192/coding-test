package programmers.level_0.introduction;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("피자 나눠 먹기 (3)")
class SharePizzaThreeTest {

    SharePizzaThree test = new SharePizzaThree();

    @Test
    void case1() {
        int slice = 7;
        int n = 10;

        int result = 2;

        assertThat(test.solution(slice, n)).isEqualTo(result);
    }

    @Test
    void case2() {
        int slice = 4;
        int n = 12;

        int result = 3;

        assertThat(test.solution(slice, n)).isEqualTo(result);
    }

    @Test
    void case3() {
        int slice = 8;
        int n = 4;

        int result = 1;

        assertThat(test.solution(slice, n)).isEqualTo(result);
    }
}