package programmers.level_0.introduction;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("369게임")
class ThreeSixNineGameTest {

    ThreeSixNineGame test = new ThreeSixNineGame();

    @Test
    void case1() {
        int order = 3;

        int result = 1;

        assertThat(test.solution(order)).isEqualTo(result);
    }

    @Test
    void case2() {
        int order = 29423;

        int result = 2;

        assertThat(test.solution(order)).isEqualTo(result);
    }
}