package programmers.introduction.level0;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("문자 반복 출력하기")
class PrintRepeatStringTest {

    PrintRepeatString printRepeatString = new PrintRepeatString();

    @Test
    void testCase1() {
        String my_string = "hello";
        int n = 3;

        String expected = "hhheeellllllooo";

        assertThat(printRepeatString.solution(my_string, n)).isEqualTo(expected);
    }
}