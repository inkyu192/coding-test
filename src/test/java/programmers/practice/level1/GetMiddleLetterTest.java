package programmers.practice.level1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("가운데 글자 가져오기")
class GetMiddleLetterTest {

    GetMiddleLetter getMiddleLetter = new GetMiddleLetter();

    @Test
    void testCase1() {
        String s = "abcde";

        String expected = "c";

        assertThat(getMiddleLetter.solution(s)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        String s = "qwer";

        String expected = "we";

        assertThat(getMiddleLetter.solution(s)).isEqualTo(expected);
    }
}