package programmers.kakao.level1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("[1차] 다트 게임")
class FirstDartGameTest {

    FirstDartGame firstDartGame = new FirstDartGame();

    @Test
    void testCase1() {
        String dartResult = "1S2D*3T";

        int expected = 37;

        assertThat(firstDartGame.solution(dartResult)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        String dartResult = "1D2S#10S";

        int expected = 9;

        assertThat(firstDartGame.solution(dartResult)).isEqualTo(expected);
    }

    @Test
    void testCase3() {
        String dartResult = "1D2S0T";

        int expected = 3;

        assertThat(firstDartGame.solution(dartResult)).isEqualTo(expected);
    }

    @Test
    void testCase4() {
        String dartResult = "1S*2T*3S";

        int expected = 23;

        assertThat(firstDartGame.solution(dartResult)).isEqualTo(expected);
    }

    @Test
    void testCase5() {
        String dartResult = "1D#2S*3S";

        int expected = 5;

        assertThat(firstDartGame.solution(dartResult)).isEqualTo(expected);
    }

    @Test
    void testCase6() {
        String dartResult = "1T2D3D#";

        int expected = -4;

        assertThat(firstDartGame.solution(dartResult)).isEqualTo(expected);
    }

    @Test
    void testCase7() {
        String dartResult = "1D2S3T*";

        int expected = 59;

        assertThat(firstDartGame.solution(dartResult)).isEqualTo(expected);
    }
}