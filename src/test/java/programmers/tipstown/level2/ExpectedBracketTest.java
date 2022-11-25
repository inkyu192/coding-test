package programmers.tipstown.level2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("예상 대진표")
class ExpectedBracketTest {

    ExpectedBracket expectedBracket = new ExpectedBracket();

    @Test
    void testCase1() {
        int n = 8;
        int a = 4;
        int b = 7;

        int expected = 3;

        assertThat(expectedBracket.solution(n, a, b)).isEqualTo(expected);
    }
}