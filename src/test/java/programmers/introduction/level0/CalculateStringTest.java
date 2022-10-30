package programmers.introduction.level0;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("문자열 계산하기")
class CalculateStringTest {

    CalculateString calculateString = new CalculateString();

    @Test
    void testCase1() {
        String my_string = "3 + 4";

        int expected = 7;

        assertThat(calculateString.solution(my_string)).isEqualTo(expected);
    }
}