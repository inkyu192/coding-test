package programmers.introduction.level0;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("숨어있는 숫자의 덧셈 (2)")
class SumOfHiddenNumberTwoTest {

    SumOfHiddenNumberTwo sumOfHiddenNumberTwo = new SumOfHiddenNumberTwo();

    @Test
    void testCase1() {
        String my_string = "aAb1B2cC34oOp";

        int expected = 37;

        assertThat(sumOfHiddenNumberTwo.solution(my_string)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        String my_string = "1a2b3c4d123Z";

        int expected = 133;

        assertThat(sumOfHiddenNumberTwo.solution(my_string)).isEqualTo(expected);
    }
}