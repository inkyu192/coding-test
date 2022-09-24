package programmers.practice.level2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("JadenCase 문자열 만들기")
class CreatingJadenCaseStringsTest {

    CreatingJadenCaseStrings creatingJadenCaseStrings = new CreatingJadenCaseStrings();

    @Test
    void testCase1() {
        String s = "3people unFollowed me";

        String expected = "3people Unfollowed Me";

        assertThat(creatingJadenCaseStrings.solution(s)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        String s = "for the last week";

        String expected = "For The Last Week";

        assertThat(creatingJadenCaseStrings.solution(s)).isEqualTo(expected);
    }

    @Test
    void testCase3() {
        String s = "3people   unFollowed me";

        String expected = "3people   Unfollowed Me";

        assertThat(creatingJadenCaseStrings.solution(s)).isEqualTo(expected);
    }

    @Test
    void testCase4() {
        String s = "for the last   week ";

        String expected = "For The Last   Week ";

        assertThat(creatingJadenCaseStrings.solution(s)).isEqualTo(expected);
    }
}