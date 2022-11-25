package programmers.practice.level2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("JadenCase 문자열 만들기")
class MakeJadenCaseStringTest {

    MakeJadenCaseString makeJadenCaseString = new MakeJadenCaseString();

    @Test
    void testCase1() {
        String s = "3people unFollowed me";

        String expected = "3people Unfollowed Me";

        assertThat(makeJadenCaseString.solution(s)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        String s = "for the last week";

        String expected = "For The Last Week";

        assertThat(makeJadenCaseString.solution(s)).isEqualTo(expected);
    }
}