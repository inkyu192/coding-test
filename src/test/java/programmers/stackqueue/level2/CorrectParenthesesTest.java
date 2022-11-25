package programmers.stackqueue.level2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("올바른 괄호")
class CorrectParenthesesTest {

    CorrectParentheses correctParentheses = new CorrectParentheses();

    @Test
    void testCase1() {
        String s = "()()";

        Assertions.assertThat(correctParentheses.solution(s)).isTrue();
    }

    @Test
    void testCase2() {
        String s = "(())()";

        Assertions.assertThat(correctParentheses.solution(s)).isTrue();
    }

    @Test
    void testCase3() {
        String s = ")()(";

        Assertions.assertThat(correctParentheses.solution(s)).isFalse();
    }

    @Test
    void testCase4() {
        String s = "(()(";

        Assertions.assertThat(correctParentheses.solution(s)).isFalse();
    }
}