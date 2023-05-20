package programmers.level_0.introduction;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("숨어있는 숫자의 덧셈 (1)")
class SumOfHiddenNumberOneTest {

    SumOfHiddenNumberOne test = new SumOfHiddenNumberOne();

    @Test
    void case1() {
        String my_string = "aAb1B2cC34oOp";

        int result = 10;

        assertThat(test.solution(my_string)).isEqualTo(result);
    }

    @Test
    void case2() {
        String my_string = "1a2b3c4d123";

        int result = 16;

        assertThat(test.solution(my_string)).isEqualTo(result);
    }
}