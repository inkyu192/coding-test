package programmers.level_0.introduction;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("구슬을 나누는 경우의 수")
class NumberOfCaseMarbleDivideTest {

    NumberOfCaseMarbleDivide test = new NumberOfCaseMarbleDivide();

    @Test
    void case1() {
        int balls = 3;
        int share = 2;

        int result = 3;

        assertThat(test.solution(balls, share)).isEqualTo(result);
    }

    @Test
    void case2() {
        int balls = 5;
        int share = 3;

        int result = 10;

        assertThat(test.solution(balls, share)).isEqualTo(result);
    }
}