package programmers.introduction.level0;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("구슬을 나누는 경우의 수")
class NumberOfCaseMarbleDivideTest {

    NumberOfCaseMarbleDivide numberOfCaseMarbleDivide = new NumberOfCaseMarbleDivide();

    @Test
    void testCase1() {
        int balls = 3;
        int share = 2;

        int expected = 3;

        assertThat(numberOfCaseMarbleDivide.solution(balls, share)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int balls = 5;
        int share = 3;

        int expected = 10;

        assertThat(numberOfCaseMarbleDivide.solution(balls, share)).isEqualTo(expected);
    }
}