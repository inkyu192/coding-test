package programmers.practice.level1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("문자열을 정수로 바꾸기")
class ConvertStringToIntegerTest {

    ConvertStringToInteger convertStringToInteger = new ConvertStringToInteger();

    @Test
    void testCase1() {
        String s = "1234";

        int expected = 1234;

        assertThat(convertStringToInteger.solution(s)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        String s = "-1234";

        int expected = -1234;

        assertThat(convertStringToInteger.solution(s)).isEqualTo(expected);
    }
}