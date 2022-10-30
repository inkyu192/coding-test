package programmers.introduction.level0;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("숨어있는 숫자의 덧셈 (1)")
class SumOfHiddenNumberOneTest {

    SumOfHiddenNumberOne sumOfHiddenNumberOne = new SumOfHiddenNumberOne();

    @Test
    void testCase1() {
        String my_string = "aAb1B2cC34oOp";

        int expected = 10;

        assertThat(sumOfHiddenNumberOne.solution(my_string)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        String my_string = "1a2b3c4d123";

        int expected = 16;

        assertThat(sumOfHiddenNumberOne.solution(my_string)).isEqualTo(expected);
    }
}