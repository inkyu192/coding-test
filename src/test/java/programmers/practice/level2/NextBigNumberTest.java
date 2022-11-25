package programmers.practice.level2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("다음 큰 숫자")
class NextBigNumberTest {

    NextBigNumber nextBigNumber = new NextBigNumber();

    @Test
    void testCase1() {
        int n = 78;

        int expected = 83;

        assertThat(nextBigNumber.solution(n)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int n = 15;

        int expected = 23;

        assertThat(nextBigNumber.solution(n)).isEqualTo(expected);
    }
}