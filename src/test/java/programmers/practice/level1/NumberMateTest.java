package programmers.practice.level1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("숫자 짝꿍")
class NumberMateTest {

    NumberMate numberMate = new NumberMate();

    @Test
    void testCase1() {
        String X = "100";
        String Y = "2345";

        String expected = "-1";

        assertThat(numberMate.solution(X, Y)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        String X = "100";
        String Y = "203045";

        String expected = "0";

        assertThat(numberMate.solution(X, Y)).isEqualTo(expected);
    }

    @Test
    void testCase3() {
        String X = "100";
        String Y = "123450";

        String expected = "10";

        assertThat(numberMate.solution(X, Y)).isEqualTo(expected);
    }

    @Test
    void testCase4() {
        String X = "12321";
        String Y = "42531";

        String expected = "321";

        assertThat(numberMate.solution(X, Y)).isEqualTo(expected);
    }

    @Test
    void testCase5() {
        String X = "5525";
        String Y = "1255";

        String expected = "552";

        assertThat(numberMate.solution(X, Y)).isEqualTo(expected);
    }
}