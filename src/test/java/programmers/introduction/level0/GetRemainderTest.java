package programmers.introduction.level0;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("나머지 구하기")
class GetRemainderTest {

    GetRemainder getRemainder = new GetRemainder();

    @Test
    void testCase1() {
        int num1 = 3;
        int num2 = 2;

        int expected = 1;

        assertThat(getRemainder.solution(num1, num2)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int num1 = 10;
        int num2 = 5;

        int expected = 0;

        assertThat(getRemainder.solution(num1, num2)).isEqualTo(expected);
    }
}