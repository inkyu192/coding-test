package programmers.practice.level2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("숫자의 표현")
class ExpressionOfNumberTest {

    ExpressionOfNumber expressionOfNumber = new ExpressionOfNumber();

    @Test
    void testCase1() {
        int n = 15;

        int expected = 4;

        assertThat(expressionOfNumber.solution(n)).isEqualTo(expected);
    }
}