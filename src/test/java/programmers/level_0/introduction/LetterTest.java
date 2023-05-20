package programmers.level_0.introduction;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("편지")
class LetterTest {

    Letter test = new Letter();

    @Test
    void case1() {
        String message = "happy birthday!";

        int result = 30;

        assertThat(test.solution(message)).isEqualTo(result);
    }

    @Test
    void case2() {
        String message = "I love you~";

        int result = 22;

        assertThat(test.solution(message)).isEqualTo(result);
    }
}