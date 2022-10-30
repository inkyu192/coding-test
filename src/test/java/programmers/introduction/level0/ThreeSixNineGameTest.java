package programmers.introduction.level0;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("369게임")
class ThreeSixNineGameTest {

    ThreeSixNineGame threeSixNineGame = new ThreeSixNineGame();

    @Test
    void testCase1() {
        int order = 3;

        int expected = 1;

        assertThat(threeSixNineGame.solution(order)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int order = 29423;

        int expected = 2;

        assertThat(threeSixNineGame.solution(order)).isEqualTo(expected);
    }
}