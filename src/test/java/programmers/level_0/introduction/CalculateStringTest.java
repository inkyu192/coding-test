package programmers.level_0.introduction;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("문자열 계산하기")
class CalculateStringTest {

    CalculateString test = new CalculateString();

    @Test
    void case1() {
        String my_string = "3 + 4";

        int result = 7;

        assertThat(test.solution(my_string)).isEqualTo(result);
    }
}