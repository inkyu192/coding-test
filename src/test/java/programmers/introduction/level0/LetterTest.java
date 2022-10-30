package programmers.introduction.level0;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import programmers.introduction.level0.Letter;

import static org.assertj.core.api.Assertions.*;

@DisplayName("편지")
class LetterTest {

    Letter letter = new Letter();

    @Test
    void testCase1() {
        String message = "happy birthday!";

        int expected = 30;

        assertThat(letter.solution(message)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        String message = "I love you~";

        int expected = 22;

        assertThat(letter.solution(message)).isEqualTo(expected);
    }
}