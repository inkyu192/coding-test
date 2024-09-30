package programmers.level_1.practice;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("문자열을 정수로 바꾸기")
class ConvertStringToIntegerTest {

    ConvertStringToInteger convertStringToInteger;

    @BeforeEach
    void beforeEach() {
        convertStringToInteger = new ConvertStringToInteger();
    }

    @Test
    void case1() {
        String s = "1234";
        int expected = 1234;

        Assertions.assertThat(convertStringToInteger.solution(s)).isEqualTo(expected);
    }

    @Test
    void case2() {
        String s = "-1234";
        int expected = -1234;

        Assertions.assertThat(convertStringToInteger.solution(s)).isEqualTo(expected);
    }
}