package programmers.level_0.introduction;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("한 번만 등장한 문자")
class StringOnlyOneTest {

    StringOnlyOne test = new StringOnlyOne();

    @Test
    void case1() {
        String s = "abcabcadc";

        String result = "d";

        assertThat(test.solution(s)).isEqualTo(result);
    }

    @Test
    void case2() {
        String s = "abdc";

        String result = "abcd";

        assertThat(test.solution(s)).isEqualTo(result);
    }

    @Test
    void case3() {
        String s = "hello";

        String result = "eho";

        assertThat(test.solution(s)).isEqualTo(result);
    }
}