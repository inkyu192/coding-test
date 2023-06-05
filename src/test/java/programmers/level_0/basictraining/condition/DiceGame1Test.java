package programmers.level_0.basictraining.condition;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("주사위 게임 1")
class DiceGame1Test {

    DiceGame1 test = new DiceGame1();

    @Test
    void case1() {
        int a = 3;
        int b = 5;

        int result = 34;

        assertThat(test.solution(a, b)).isEqualTo(result);
    }

    @Test
    void case2() {
        int a = 6;
        int b = 1;

        int result = 14;

        assertThat(test.solution(a, b)).isEqualTo(result);
    }

    @Test
    void case3() {
        int a = 2;
        int b = 4;

        int result = 2;

        assertThat(test.solution(a, b)).isEqualTo(result);
    }
}