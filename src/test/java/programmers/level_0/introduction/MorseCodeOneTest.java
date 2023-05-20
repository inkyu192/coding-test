package programmers.level_0.introduction;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("모스부호 (1)")
class MorseCodeOneTest {

    MorseCodeOne test = new MorseCodeOne();

    @Test
    void case1() {
        String letter = ".... . .-.. .-.. ---";

        String result = "hello";

        assertThat(test.solution(letter)).isEqualTo(result);
    }

    @Test
    void case2() {
        String letter = ".--. -.-- - .... --- -.";

        String result = "python";

        assertThat(test.solution(letter)).isEqualTo(result);
    }
}