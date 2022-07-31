package programmers.lv1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("2016년")
class TwoThousandSixteenYearTest {

    TwoThousandSixteenYear twoThousandSixteenYear = new TwoThousandSixteenYear();

    @Test
    void testCase1() {
        int a = 5;
        int b = 24;

        String expected = "TUE";

        assertThat(twoThousandSixteenYear.solution(a, b)).isEqualTo(expected);
    }
}