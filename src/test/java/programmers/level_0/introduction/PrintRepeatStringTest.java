package programmers.level_0.introduction;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("문자 반복 출력하기")
class PrintRepeatStringTest {

    PrintRepeatString test = new PrintRepeatString();

    @Test
    void case1() {
        String my_string = "hello";
        int n = 3;

        String result = "hhheeellllllooo";

        assertThat(test.solution(my_string, n)).isEqualTo(result);
    }
}