package programmers.codechallenge.level2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("괄호 회전하기")
class RotateParenthesesTest {

    RotateParentheses rotateParentheses = new RotateParentheses();

    @Test
    void testCase1() {
        String s = "[](){}";

        int expected = 3;

        assertThat(rotateParentheses.solution(s)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        String s = "}]()[{";

        int expected = 2;

        assertThat(rotateParentheses.solution(s)).isEqualTo(expected);
    }

    @Test
    void testCase3() {
        String s = "[)(]";

        int expected = 0;

        assertThat(rotateParentheses.solution(s)).isEqualTo(expected);
    }

    @Test
    void testCase4() {
        String s = "}}}";

        int expected = 0;

        assertThat(rotateParentheses.solution(s)).isEqualTo(expected);
    }
}