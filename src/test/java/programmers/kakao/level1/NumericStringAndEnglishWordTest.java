package programmers.kakao.level1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("숫자 문자열과 영단어")
class NumericStringAndEnglishWordTest {

    NumericStringAndEnglishWord numericStringAndEnglishWord = new NumericStringAndEnglishWord();

    @Test
    void testCase1() {
        String s = "one4seveneight";

        int expected = 1478;

        assertThat(numericStringAndEnglishWord.solution(s)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        String s = "23four5six7";

        int expected = 234567;

        assertThat(numericStringAndEnglishWord.solution(s)).isEqualTo(expected);
    }

    @Test
    void testCase3() {
        String s = "2three45sixseven";

        int expected = 234567;

        assertThat(numericStringAndEnglishWord.solution(s)).isEqualTo(expected);
    }

    @Test
    void testCase4() {
        String s = "123";

        int expected = 123;

        assertThat(numericStringAndEnglishWord.solution(s)).isEqualTo(expected);
    }

    @Test
    void testCase5() {
        String s = "23four5six7six";

        int expected = 2345676;

        assertThat(numericStringAndEnglishWord.solution(s)).isEqualTo(expected);
    }
}