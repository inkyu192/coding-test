package programmers.introduction.level0;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("자릿수 더하기")
class SumPositionalNumberTest {

    SumPositionalNumber sumPositionalNumber = new SumPositionalNumber();

    @Test
    void testCase1() {
        int n = 1234;

        int expected = 10;

        assertThat(sumPositionalNumber.solution(n)).isEqualTo(expected);
    }


    @Test
    void testCase2() {
        int n = 930211;

        int expected = 16;

        assertThat(sumPositionalNumber.solution(n)).isEqualTo(expected);
    }
}