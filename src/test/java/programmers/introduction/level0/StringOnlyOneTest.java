package programmers.introduction.level0;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("한 번만 등장한 문자")
class StringOnlyOneTest {

    StringOnlyOne stringOnlyOne = new StringOnlyOne();

    @Test
    void testCase1() {
        String s = "abcabcadc";

        String expected = "d";

        assertThat(stringOnlyOne.solution(s)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        String s = "abdc";

        String expected = "abcd";

        assertThat(stringOnlyOne.solution(s)).isEqualTo(expected);
    }

    @Test
    void testCase3() {
        String s = "hello";

        String expected = "eho";

        assertThat(stringOnlyOne.solution(s)).isEqualTo(expected);
    }
}