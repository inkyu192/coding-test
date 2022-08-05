package programmers.lv2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("가장 큰 수")
class BiggestNumberTest {

    BiggestNumber biggestNumber = new BiggestNumber();

    @Test
    void testCase1() {
        int[] numbers = {6, 10, 2};

        String expected = "6210";

        assertThat(biggestNumber.solution(numbers)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int[] numbers = {3, 30, 34, 5, 9};

        String expected = "9534330";

        assertThat(biggestNumber.solution(numbers)).isEqualTo(expected);
    }

    @Test
    void testCase3() {
        int[] numbers = {0, 0};

        String expected = "0";

        assertThat(biggestNumber.solution(numbers)).isEqualTo(expected);
    }
}