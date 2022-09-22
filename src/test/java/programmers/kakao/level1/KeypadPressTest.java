package programmers.kakao.level1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("[카카오 인턴] 키패드 누르기")
class KeypadPressTest {

    KeypadPress keypadPress = new KeypadPress();

    @Test
    void testCase1() {
        int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand = "right";

        String expected = "LRLLLRLLRRL";

        assertThat(keypadPress.solution(numbers, hand)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int[] numbers = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
        String hand = "left";

        String expected = "LRLLRRLLLRR";

        assertThat(keypadPress.solution(numbers, hand)).isEqualTo(expected);
    }

    @Test
    void testCase3() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String hand = "right";

        String expected = "LLRLLRLLRL";

        assertThat(keypadPress.solution(numbers, hand)).isEqualTo(expected);
    }
}