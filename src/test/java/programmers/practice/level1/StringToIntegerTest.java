package programmers.practice.level1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("문자열을 정수로 바꾸기")
class StringToIntegerTest {

    StringToInteger stringToInteger = new StringToInteger();

    @Test
    void testCase1() {
        String s = "1234";

        int expected = 1234;

        assertThat(stringToInteger.solution(s)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        String s = "-1234";

        int expected = -1234;

        assertThat(stringToInteger.solution(s)).isEqualTo(expected);
    }
}