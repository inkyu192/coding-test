package programmers.level_0.introduction;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("자릿수 더하기")
class SumPositionalNumberTest {

    SumPositionalNumber test = new SumPositionalNumber();

    @Test
    void case1() {
        int n = 1234;

        int result = 10;

        assertThat(test.solution(n)).isEqualTo(result);
    }


    @Test
    void case2() {
        int n = 930211;

        int result = 16;

        assertThat(test.solution(n)).isEqualTo(result);
    }
}