package programmers.introduction.level0;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("모스부호 (1)")
class MorseCodeOneTest {

    MorseCodeOne morseCodeOne = new MorseCodeOne();

    @Test
    void testCase1() {
        String letter = ".... . .-.. .-.. ---";

        String expected = "hello";

        assertThat(morseCodeOne.solution(letter)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        String letter = ".--. -.-- - .... --- -.";

        String expected = "python";

        assertThat(morseCodeOne.solution(letter)).isEqualTo(expected);
    }
}